package com.arohau.bridge.ex1;

public class Hoodie implements ClothingItem {
    private final String type = "Hoddie";
    private final Size size;

    public Hoodie(Size size) {
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
