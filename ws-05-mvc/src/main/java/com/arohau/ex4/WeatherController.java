package com.arohau.ex4;

public class WeatherController {
    private final WeatherStation model;

    public WeatherController(WeatherStation model) {
        this.model = model;
    }

    public void changeWeather(double celsius, double humidity) {
        model.writeCelsius(celsius);
        model.writeHumidity(humidity);
    }
}
