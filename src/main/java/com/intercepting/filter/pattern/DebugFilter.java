package com.intercepting.filter.pattern;

public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("Debug filter: " + request);
    }
}
