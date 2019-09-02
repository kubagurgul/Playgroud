package com.playground.designPatterns.bridge;

public class RedCircle implements DrawAPI {
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing red circle");
    }
}
