package com.arohau.ex2;

/**
 * Passive Model and Passive View
 */
public class Main {
    public static void main(String[] args) {
        // init part
        Thermometer model = new Thermometer(0);
        WeatherView view = new WeatherView();
        WeatherController controller = new WeatherController(model, view);

        // start interaction
        controller.changeTemperature(15);
        System.out.println("-".repeat(12));
        controller.changeTemperature(25);
    }
}
