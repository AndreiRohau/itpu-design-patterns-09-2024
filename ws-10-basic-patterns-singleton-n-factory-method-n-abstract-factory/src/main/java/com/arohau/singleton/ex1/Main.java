package com.arohau.singleton.ex1;

public class Main {
    private static final Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        logger.log("first log msg");

        User.getSingletonInstance("user-name", "user-email", "user-country");
    }
}
