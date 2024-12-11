package com.arohau.bridge.ex1;

public class App {
    public static void main(String[] args) {
        var hoodie = new Hoodie(new ChildSize());
        hoodie.getType();
        hoodie.getSize().get();


        var hoodie2 = new Hoodie(new AdultSize());

        var shirt = new Shirt(new AdultSize());
        shirt.getType();
        shirt.getSize().get();
    }
}
