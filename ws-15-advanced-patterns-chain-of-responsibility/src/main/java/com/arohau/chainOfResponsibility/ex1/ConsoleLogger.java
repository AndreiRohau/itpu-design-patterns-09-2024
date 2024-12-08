package com.arohau.chainOfResponsibility.ex1;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LoggerRequest request) {
        if (request.getLoggerType() == LoggerRequest.LoggerType.CONSOLE) {
            System.out.println(request.getMessage());
        } else if (nextLogger != null) {
            nextLogger.log(request);
        }
    }


}
