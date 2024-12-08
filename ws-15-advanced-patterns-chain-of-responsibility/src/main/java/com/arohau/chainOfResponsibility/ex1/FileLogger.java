package com.arohau.chainOfResponsibility.ex1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {

    public FileLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LoggerRequest request) {
        if (request.getLoggerType() == LoggerRequest.LoggerType.FILE) {
            try {
//                var writer = new BufferedWriter(new FileWriter("src/main/resources/log.txt", true));
//                writer.write(request.getMessage() + "\n");
//                writer.close();
                System.out.println("Writing logs to file...");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (nextLogger != null) {
            nextLogger.log(request);
        }

    }
}
