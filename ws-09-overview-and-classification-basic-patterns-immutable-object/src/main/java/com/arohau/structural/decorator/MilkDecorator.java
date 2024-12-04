package com.arohau.structural.decorator;

// Decorator classes
public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        double milkCost = 0.4;
        double originalCost = coffee.cost();
        double decoratedResult = originalCost + milkCost;
        return decoratedResult;
    }

    @Override
    public String getDescription() {
        String mildDescription = "with Milk";
        String originalDescription = coffee.getDescription();
        String decoratedResult = originalDescription + mildDescription;
        return decoratedResult;
    }
}
