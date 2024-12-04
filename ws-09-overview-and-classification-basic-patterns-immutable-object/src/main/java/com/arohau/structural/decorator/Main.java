package com.arohau.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        Coffee sugarCoffee = new SugarDecorator(milkCoffee);
        Coffee whippedCreamCoffee = new WhippedCreamDecorator(sugarCoffee);

        System.out.println(whippedCreamCoffee.cost());
    }
}
