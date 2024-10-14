package com.arohau.ex3.refactored;

public class PayStub {
    private Employee employee;
    private double grossPay;
    private double taxes;
    private double netPay;

    public PayStub(Employee employee, double grossPay, double taxes, double netPay) {
        this.employee = employee;
        this.grossPay = grossPay;
        this.taxes = taxes;
        this.netPay = netPay;
    }
}
