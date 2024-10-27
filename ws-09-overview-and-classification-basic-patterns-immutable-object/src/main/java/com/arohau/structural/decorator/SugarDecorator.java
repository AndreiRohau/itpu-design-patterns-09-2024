package com.arohau.structural.decorator;

public class SugarDecorator implements Coffee {
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double cost() {
        return coffee.cost() + 0.2; // Additional cost for sugar
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}
