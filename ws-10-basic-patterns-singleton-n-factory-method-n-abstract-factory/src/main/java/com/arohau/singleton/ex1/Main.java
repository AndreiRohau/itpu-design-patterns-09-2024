package com.arohau.singleton.ex1;

public class Main {
//    private static final Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();
        instance1.log("first log msg");

        System.out.println(instance1 == instance2);

        User singletonInstance1 = User.getSingletonInstance("user-name", "user-email", "user-country");
        User singletonInstance2 = User.getSingletonInstance("user-name2", "user-email2", "user-country2");
        System.out.println(singletonInstance1 + " - " + singletonInstance1.toString());
        System.out.println(singletonInstance2 + " - " + singletonInstance2.toString());
    }
}
