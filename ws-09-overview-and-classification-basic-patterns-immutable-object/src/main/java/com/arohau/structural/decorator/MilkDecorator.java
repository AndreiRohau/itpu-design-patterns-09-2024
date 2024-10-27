package com.arohau.structural.decorator;

// Decorator classes
public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double cost() {
        return coffee.cost() + 0.5; // Additional cost for milk
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}
