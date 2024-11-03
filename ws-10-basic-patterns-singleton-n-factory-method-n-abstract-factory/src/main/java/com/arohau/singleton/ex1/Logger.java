package com.arohau.singleton.ex1;

public enum Logger {
    INSTANCE;

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void log(String logMessage) {
        System.out.println(logMessage);
    }
}
