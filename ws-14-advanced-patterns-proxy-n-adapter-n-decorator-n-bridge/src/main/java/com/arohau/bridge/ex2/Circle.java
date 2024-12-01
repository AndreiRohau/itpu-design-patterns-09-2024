package com.arohau.bridge.ex2;

public class Circle implements Shape {
    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void getType() {
        System.out.println("Circle");
    }

    @Override
    public Color getColor() {
        return color;
    }
}
