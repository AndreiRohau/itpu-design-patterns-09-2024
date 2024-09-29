package com.arohau.ex2;

public class WeatherController {
    private Thermometer model;
    private WeatherView view;

    public WeatherController(Thermometer model, WeatherView view) {
        this.model = model;
        this.view = view;
    }
    public void changeTemperature(double celsius) {
        model.setCelsius(celsius);
        view.displayTemperature(model.getCelsius(), model.readFahrenheit(), model.readKelvin());
    }
}
