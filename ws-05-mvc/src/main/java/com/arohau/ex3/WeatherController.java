package com.arohau.ex3;

public class WeatherController {
    private Thermometer model;

    public WeatherController(Thermometer model) {
        this.model = model;
    }

    public void changeTemperature(double celsius) {
        model.setCelsius(celsius);
    }
}