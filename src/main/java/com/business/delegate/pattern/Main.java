package com.business.delegate.pattern;

public class Main {
    public static void main(String[] args) {
        BusinessDelegate delegate = new BusinessDelegate();
        delegate.setServiceType("EJB");

        Client client = new Client(delegate);
        client.doTask();
        delegate.setServiceType("JMS");
        client.doTask();
    }
}
