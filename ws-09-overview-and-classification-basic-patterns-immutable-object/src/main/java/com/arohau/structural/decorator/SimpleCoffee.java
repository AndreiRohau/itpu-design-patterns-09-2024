package com.arohau.structural.decorator;

// Concrete component
public class SimpleCoffee implements Coffee {
    public double cost() {
        return 2.0; // Base cost of simple coffee
    }

    public String getDescription() {
        return "Simple coffee";
    }
}
