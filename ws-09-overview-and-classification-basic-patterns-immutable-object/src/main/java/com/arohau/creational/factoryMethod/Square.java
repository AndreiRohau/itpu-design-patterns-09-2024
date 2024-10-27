package com.arohau.creational.factoryMethod;

public class Square implements Polygon {
    @Override
    public String getType() {
        return Square.class.getSimpleName();
    }
}
