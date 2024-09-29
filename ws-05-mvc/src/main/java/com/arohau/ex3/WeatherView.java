package com.arohau.ex3;

public class WeatherView implements Observer {
    private Thermometer model;

    public WeatherView(Thermometer model) {
        this.model = model;
        model.registerObserver(this);
    }

    public void update() {
        System.out.println("Temperature:");
        System.out.printf("\t%g Celsius\n", model.getCelsius());
        System.out.printf("\t%g Fahrenheit\n", model.readFahrenheit());
        System.out.printf("\t%g Kelvin\n", model.readKelvin());
    }
}