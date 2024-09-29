package com.arohau.ex1;

public class Main {
    public static void main(String[] args) {
        // init part
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // start interaction
        controller.updateView();

        // user input
        controller.setStudentName();

        // user see updated view
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Ian Goodtime");
        student.setRollNo("15UCS157");
        return student;
    }
}
