package com.playground.designPatterns.adapter;

public class Main {

    public static void main(String[] args) {
        MoveableAdapter moveableAdapter = new MoveableAdapterImpl(new Mercedes());
        double speed = moveableAdapter.getSpeed();
        System.out.println(speed);
    }
}

