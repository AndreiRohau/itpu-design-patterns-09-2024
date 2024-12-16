package com.arohau.strategy.ex0;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!!! Squeak!!! Squeak!!!");
    }
}
