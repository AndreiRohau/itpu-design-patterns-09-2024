package com.arohau.strategy.ex0;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!! Quack!!! Quack!!!");
    }
}
