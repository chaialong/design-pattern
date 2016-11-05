package com.builder.pattern;

public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
}
