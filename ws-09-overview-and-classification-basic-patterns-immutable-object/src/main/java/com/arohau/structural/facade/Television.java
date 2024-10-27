package com.arohau.structural.facade;

public class Television {
    public void turnOn() {
        System.out.println("Television turnOn");
    }

    public void setInput(String dvd) {
        System.out.println("Television setInput dvd = " + dvd);
    }

    public void turnOff() {
        System.out.println("Television turnOff");
    }
}
