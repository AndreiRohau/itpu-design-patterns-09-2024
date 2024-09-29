package com.arohau.ex4;

public class WeatherController {
    private final WeatherStation model;

    public WeatherController(WeatherStation model) {
        this.model = model;
    }

    public void changeWeather(Double celsius, Double humidity) {
        model.writeCelsiusAndWriteHumidity(celsius, humidity);
    }
}
