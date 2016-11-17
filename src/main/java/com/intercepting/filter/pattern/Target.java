package com.intercepting.filter.pattern;

public class Target implements Filter {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
