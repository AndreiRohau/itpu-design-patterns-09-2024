package com.arohau.strategy.ex0;

public abstract class AbstractDuck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    abstract void display();
    public AbstractDuck() {

    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float...");
    }

}
