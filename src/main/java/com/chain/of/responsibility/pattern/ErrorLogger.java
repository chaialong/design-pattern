package com.chain.of.responsibility.pattern;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("Error console logger: " + message);
    }
}
