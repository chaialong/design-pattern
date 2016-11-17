package com.intercepting.filter.pattern;

public class Main {
    public static void main(String[] args) {
        FilterManager manager = new FilterManager(new Target());
        manager.setFilter(new AuthenticationFilter());
        manager.setFilter(new DebugFilter());
        Client client = new Client();
        client.setManager(manager);
        client.sendRequest("HOME");
    }
}
