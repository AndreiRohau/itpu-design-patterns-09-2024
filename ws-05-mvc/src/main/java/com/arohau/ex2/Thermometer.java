package com.arohau.ex2;

public class Thermometer {
    private double celsius;

    public Thermometer(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double temperature) {
        celsius = temperature;
    }
    public double getCelsius() {
        return celsius;
    }
    public double readFahrenheit() {
        return celsius * 9.0 / 5.0 + 32;
    }
    public double readKelvin() {
        return celsius + 273.15;
    }
}

