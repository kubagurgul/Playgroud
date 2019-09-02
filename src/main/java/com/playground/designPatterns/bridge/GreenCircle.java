package com.playground.designPatterns.bridge;

public class GreenCircle implements DrawAPI {

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing green circle");
    }
}
