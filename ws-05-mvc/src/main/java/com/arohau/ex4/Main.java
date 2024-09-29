package com.arohau.ex4;

/**
 * Example With the Model Facade
 */
public class Main {
    public static void main(String[] args) {
        // Create Model, View, and Controller
        WeatherStation model = new WeatherStation();
        WeatherView view = new WeatherView(model);
        System.out.println("Basic status");
        view.update();

        WeatherController controller = new WeatherController(model);
        // Change Weather Station data using Controller
        controller.changeWeather(20.0, 85.0);
        controller.changeWeather(30.0, 95.0);
        model.removeObserver(view);
    }
}