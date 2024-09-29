package com.arohau.ex1;

import java.util.Scanner;

public class StudentController {
    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new NAME in console:");
        String userName = scanner.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        model.setName(userName);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        System.out.println("-".repeat(11));
        view.printStudentDetails(model.getName(), model.getRollNo());
        System.out.println();
    }
}

