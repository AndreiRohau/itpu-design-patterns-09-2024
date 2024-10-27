package com.arohau.structural.bridge.impl;

import com.arohau.structural.bridge.DVDPlayer;

public class PhilipsDVDPlayer extends DVDPlayer {
    @Override
    public void powerOn() {
        System.out.print("PhilipsDVDPlayer - ");
        super.powerOn();
    }

    @Override
    public void powerOff() {
        System.out.print("PhilipsDVDPlayer - ");
        super.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        System.out.print("PhilipsDVDPlayer - ");
        super.setChannel(channel);
    }

    @Override
    public void volumeUp() {
        System.out.print("PhilipsDVDPlayer - ");
        super.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.print("PhilipsDVDPlayer - ");
        super.volumeDown();
    }
}
