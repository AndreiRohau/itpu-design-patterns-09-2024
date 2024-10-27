package com.arohau.structural.bridge;

// Abstraction
public abstract class AbstractRemoteControl implements RemoteControl {
    protected Device device;

    public AbstractRemoteControl(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.powerOn();
    }

    public void powerOff() {
        device.powerOff();
    }

    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    public void volumeUp() {
        device.volumeUp();
    }

    public void volumeDown() {
        device.volumeDown();
    }
}
