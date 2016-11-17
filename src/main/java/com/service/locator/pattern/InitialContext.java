package com.service.locator.pattern;

public class InitialContext {
    public Object lookup(String name) {
        if (name.equalsIgnoreCase("Service1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (name.equalsIgnoreCase("Service2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }

        return null;
    }
}
