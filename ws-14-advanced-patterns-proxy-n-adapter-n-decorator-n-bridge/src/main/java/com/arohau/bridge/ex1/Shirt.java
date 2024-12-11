package com.arohau.bridge.ex1;

public class Shirt implements ClothingItem {
    private final String type = "Shirt";
    private final Size size;

    public Shirt(Size size) {
        this.size = size;
    }

    @Override
    public void getType() {
        System.out.println(type);
    }

    @Override
    public Size getSize() {
        return size;
    }
}
