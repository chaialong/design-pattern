package com.front.controller.pattern;

public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("student")) {
            studentView.show();
        } else if (request.equalsIgnoreCase("home")){
            homeView.show();
        } else {
            System.out.println("Unknown request, please check");
        }
    }
}
