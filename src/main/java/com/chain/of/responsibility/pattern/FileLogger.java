package com.chain.of.responsibility.pattern;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("File console logger: " + message);
    }
}
