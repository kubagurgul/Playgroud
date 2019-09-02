package com.playground.designPatterns.bridge;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedCircle(), 10, 20, 5);
        circle.draw();
    }
}
