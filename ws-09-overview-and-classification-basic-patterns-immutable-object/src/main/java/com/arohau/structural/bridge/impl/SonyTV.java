package com.arohau.structural.bridge.impl;

import com.arohau.structural.bridge.TV;

public class SonyTV extends TV {
    @Override
    public void powerOn() {
        System.out.print("SonyTv - ");
        super.powerOn();
    }

    @Override
    public void powerOff() {
        System.out.print("SonyTv - ");
        super.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        System.out.print("SonyTv - ");
        super.setChannel(channel);
    }

    @Override
    public void volumeUp() {
        System.out.print("SonyTv - ");
        super.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.print("SonyTv - ");
        super.volumeDown();
    }
}
