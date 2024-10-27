package com.arohau.structural.bridge;

// Implementation
public class TV implements Device {
    @Override
    public void powerOn() {
        System.out.println("powerOn TV");
    }

    @Override
    public void powerOff() {
        System.out.println("powerOff TV");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("setChannel TV : " + channel);
    }

    @Override
    public void volumeUp() {
        System.out.println("volumeUp TV");
    }

    @Override
    public void volumeDown() {
        System.out.println("volumeDown TV");
    }
    // Other Implementations for TV
}
