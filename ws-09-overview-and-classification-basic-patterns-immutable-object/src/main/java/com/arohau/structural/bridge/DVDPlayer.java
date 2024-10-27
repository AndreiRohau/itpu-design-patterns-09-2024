package com.arohau.structural.bridge;

// Implementation
public class DVDPlayer implements Device {
    @Override
    public void powerOn() {
        System.out.println("powerOn DVDPlayer");
    }

    @Override
    public void powerOff() {
        System.out.println("powerOff DVDPlayer");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("setChannel DVDPlayer : " + channel);
    }

    @Override
    public void volumeUp() {
        System.out.println("volumeUp DVDPlayer");
    }

    @Override
    public void volumeDown() {
        System.out.println("volumeDown DVDPlayer");
    }
    // Other Implementations for DVDPlayer
}
