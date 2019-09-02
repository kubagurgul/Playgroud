package com.playground.designPatterns.adapter;

public class MoveableAdapterImpl implements MoveableAdapter {
    Movable movable;

    public MoveableAdapterImpl(Movable moveable) {
        this.movable = moveable;
    }

    public double getSpeed() {
        // adopt this method
        return this.movable.getSpeed() * 1.2;
    }
}
