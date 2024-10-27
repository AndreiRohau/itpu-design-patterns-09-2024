package com.arohau.creational.factoryMethod;

public class Triangle implements Polygon {
    @Override
    public String getType() {
        return Triangle.class.getSimpleName();
    }
}
