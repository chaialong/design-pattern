package com.observer.pattern;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Hex string: " + Integer.toHexString(this.subject.getState()));
    }
}
