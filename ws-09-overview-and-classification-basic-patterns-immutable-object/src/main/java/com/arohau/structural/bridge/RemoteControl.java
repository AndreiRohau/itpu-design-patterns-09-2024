package com.arohau.structural.bridge;

// Abstraction interface
public interface RemoteControl {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void volumeUp();
    void volumeDown();
}
