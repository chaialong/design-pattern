package com.bridge.pattern;

public class GreenCircle implements DrawApi {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", y: "+ y +"]");
    }
}
