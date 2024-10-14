package com.arohau.ex3.refactored;

import java.util.List;

public class PayrollService implements PayrollProcessor {

    private EmployeeService employeeService;
    private PayrollCalculator payrollCalculator;
    private TaxCalculator taxCalculator;
    private PayrollSaver payrollSaver;

    public PayrollService(EmployeeService employeeService, PayrollCalculator payrollCalculator,
                          TaxCalculator taxCalculator, PayrollSaver payrollSaver) {
        this.employeeService = employeeService;
        this.payrollCalculator = payrollCalculator;
        this.taxCalculator = taxCalculator;
        this.payrollSaver = payrollSaver;
    }

    @Override
    public void processPayroll() {
        List<Employee> employees = employeeService.loadEmployees();
        for (Employee employee : employees) {
            processPayroll(employee);
        }
    }

    private void processPayroll(Employee employee) {
        double grossPay = payrollCalculator.calculateGrossPay(employee);
        double taxes = taxCalculator.calculateTaxes(employee);
        double netPay = payrollCalculator.calculateNetPay(employee);
        PayStub payStub = preparePayStub(employee, grossPay, taxes, netPay);
        payrollSaver.savePayrollData(payStub);
    }

    private PayStub preparePayStub(Employee employee, double grossPay,
                                   double taxes, double netPay) {
        return new PayStub(employee, grossPay, taxes, netPay);
    }
}
