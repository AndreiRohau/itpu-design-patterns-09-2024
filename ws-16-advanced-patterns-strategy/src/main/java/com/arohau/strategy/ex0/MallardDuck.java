package com.arohau.strategy.ex0;

public class MallardDuck extends AbstractDuck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("Ima Mallard duck");
    }
}
