package com.composite.entity.pattern;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second test", "New data");
        client.printData();
    }
}
