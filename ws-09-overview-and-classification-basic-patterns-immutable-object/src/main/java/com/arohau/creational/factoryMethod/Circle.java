package com.arohau.creational.factoryMethod;

public class Circle implements Polygon {
    @Override
    public String getType() {
        return Circle.class.getSimpleName();
    }
}
