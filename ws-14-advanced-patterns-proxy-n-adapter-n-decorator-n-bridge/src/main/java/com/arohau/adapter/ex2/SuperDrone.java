package com.arohau.adapter.ex2;

public class SuperDrone implements Drone {
    @Override
    public void beep() {
        System.out.println("SuperDrone beep");
    }

    @Override
    public void spinRotors() {
        System.out.println("SuperDrone spinRotors");
    }

    @Override
    public void takeOff() {
        System.out.println("SuperDrone takeOff");
    }
}
