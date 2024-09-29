package com.arohau.ex3;

/**
 * Active Model and Active View with Observer Pattern
 */
public class Main {
    public static void main(String[] args) {
        // Create Model, View, and Controller
        Thermometer model = new Thermometer();
        WeatherView view = new WeatherView(model);
        WeatherController controller = new WeatherController(model);
        // Change Temperature using Controller
        controller.changeTemperature(20.0);
        System.out.println("-".repeat(12));
        controller.changeTemperature(30.0);
        model.removeObserver(view);
    }
}
