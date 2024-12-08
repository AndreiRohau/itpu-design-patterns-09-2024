package com.arohau.chainOfResponsibility.ex1;

public abstract class Logger {

    public final Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void log(LoggerRequest request);

}
