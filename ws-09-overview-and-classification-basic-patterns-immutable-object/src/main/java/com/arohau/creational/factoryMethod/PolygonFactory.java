package com.arohau.creational.factoryMethod;

public class PolygonFactory {
    public Polygon getPolygon(int numberOfSides) {
        if (numberOfSides == 0) {
            return new Circle();
        }
        if (numberOfSides == 3) {
            return new Triangle();
        }
        if (numberOfSides == 4) {
            return new Square();
        }
        return null;
    }
}
