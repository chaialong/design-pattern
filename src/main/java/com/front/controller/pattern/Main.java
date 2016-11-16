package com.front.controller.pattern;

public class Main {
    public static void main(String[] args) {
        FrontController controller = new FrontController();
        controller.dispatchRequest("student");
        controller.dispatchRequest("home");
        controller.dispatchRequest("unknown");
    }
}
