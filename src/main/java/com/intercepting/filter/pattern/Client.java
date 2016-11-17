package com.intercepting.filter.pattern;

public class Client {
    FilterManager manager;

    public void setManager(FilterManager manager) {
        this.manager = manager;
    }

    public void sendRequest(String request) {
        manager.filterRequest(request);
    }
}
