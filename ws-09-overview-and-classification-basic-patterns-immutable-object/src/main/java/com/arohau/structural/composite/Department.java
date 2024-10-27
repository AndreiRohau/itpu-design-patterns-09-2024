package com.arohau.structural.composite;

import java.util.ArrayList;
import java.util.List;

// trunk or branch
public class Department implements Employee {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void showDetails() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }
}
