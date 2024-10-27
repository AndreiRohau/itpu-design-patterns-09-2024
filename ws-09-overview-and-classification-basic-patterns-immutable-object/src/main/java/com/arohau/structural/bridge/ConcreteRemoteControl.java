package com.arohau.structural.bridge;

public class ConcreteRemoteControl implements RemoteControl {
    private final Device device;

    public ConcreteRemoteControl(Device device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.powerOn();
    }

    @Override
    public void powerOff() {
        device.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    @Override
    public void volumeUp() {
        device.volumeUp();
    }

    @Override
    public void volumeDown() {
        device.volumeDown();
    }
}
