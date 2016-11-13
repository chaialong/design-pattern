package com.nullobject.pattern;

public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    public boolean isNil() {
        return false;
    }

    public String getName() {
        return name;
    }
}
