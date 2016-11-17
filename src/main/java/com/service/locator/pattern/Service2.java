package com.service.locator.pattern;

public class Service2 implements Service {
    public String getName() {
        return "Service2";
    }

    public void execute() {
        System.out.println("Executing service2");
    }
}
