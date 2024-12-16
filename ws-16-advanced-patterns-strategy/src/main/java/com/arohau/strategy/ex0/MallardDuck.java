package com.arohau.strategy.ex0;

public class MallardDuck extends AbstractDuck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("Ima Mallard duck");
    }
}
