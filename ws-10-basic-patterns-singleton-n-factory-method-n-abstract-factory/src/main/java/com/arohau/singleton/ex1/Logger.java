package com.arohau.singleton.ex1;

public enum Logger {
    INSTANCE;

    public static Logger getInstance() {
        return INSTANCE;
    }

    // service logic
    public void log(String logMessage) {
        System.out.println(logMessage);
    }
}
