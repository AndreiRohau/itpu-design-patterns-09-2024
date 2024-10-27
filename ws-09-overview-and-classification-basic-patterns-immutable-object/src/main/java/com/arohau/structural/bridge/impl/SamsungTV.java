package com.arohau.structural.bridge.impl;

import com.arohau.structural.bridge.TV;

public class SamsungTV extends TV {
    @Override
    public void powerOn() {
        System.out.print("SamsungTV - ");
        super.powerOn();
    }

    @Override
    public void powerOff() {
        System.out.print("SamsungTV - ");
        super.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        System.out.print("SamsungTV - ");
        super.setChannel(channel);
    }

    @Override
    public void volumeUp() {
        System.out.print("SamsungTV - ");
        super.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.print("SamsungTV - ");
        super.volumeDown();
    }
}
