package com.chain.of.responsibility.pattern;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("Standard console logger: " + message);
    }
}
