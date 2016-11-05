package com.prototype.pattern;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    void draw() {
        System.out.println("Draw a rectangle.");
    }
}
