package com.arohau.command.ex2;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        light.isOn();
        LightCommandExecutor lightCommandExecutor = new LightCommandExecutor();
        lightCommandExecutor.execute(new TurnOnLightCommand(light));
        light.isOn();
        lightCommandExecutor.execute(new TurnOffLightCommand(light));
        light.isOn();
    }
}
