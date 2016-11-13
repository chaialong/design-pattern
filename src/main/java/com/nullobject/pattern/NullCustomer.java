package com.nullobject.pattern;

public class NullCustomer extends AbstractCustomer {
    public boolean isNil() {
        return true;
    }

    public String getName() {
        return "Not available in customer database";
    }
}
