package com.arohau.structural.facade;

public class SoundSystem {
    public void turnOn() {
        System.out.println("SoundSystem turnOn");
    }

    public void setVolume(int i) {
        System.out.println("SoundSystem setVolume i = " + i);
    }

    public void turnOff() {
        System.out.println("SoundSystem turnOff");
    }
}
