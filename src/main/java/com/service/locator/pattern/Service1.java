package com.service.locator.pattern;

public class Service1 implements Service {
    public String getName() {
        return "Service1";
    }

    public void execute() {
        System.out.println("Executing service1");
    }
}
