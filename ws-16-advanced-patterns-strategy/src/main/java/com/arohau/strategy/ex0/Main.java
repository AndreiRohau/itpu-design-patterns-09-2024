package com.arohau.strategy.ex0;

public class Main {
    public static void main(String[] args) {
        AbstractDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
