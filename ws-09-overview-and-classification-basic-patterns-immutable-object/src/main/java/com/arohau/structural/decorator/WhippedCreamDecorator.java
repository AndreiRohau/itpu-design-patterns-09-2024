package com.arohau.structural.decorator;

public class WhippedCreamDecorator implements Coffee {
    private Coffee coffee;

    public WhippedCreamDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double cost() {
        return coffee.cost() + 0.7; // Additional cost for whipped cream
    }

    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }
}
