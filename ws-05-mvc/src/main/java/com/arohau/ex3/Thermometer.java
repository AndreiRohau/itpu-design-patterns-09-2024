package com.arohau.ex3;

import java.util.ArrayList;
import java.util.List;

public class Thermometer {
    private double celsius;
    private final List<Observer> observers = new ArrayList<>();

    // region work with Thermometer part
    public void setCelsius(double temperature) {
        celsius = temperature;
        notifyObservers();
    }
    public double getCelsius() {
        return celsius;
    }
    // Formula: (1°C × 9/5) + 32 = 33.8°F
    public double readFahrenheit() {
        return (celsius * 9/5) + 32;
    }
    // Formula: 1°C + 273.15 = 274.15K
    public double readKelvin() {
        return celsius + 273.15;
    }
    // endregion

    // region work with Observer part
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
    // endregion
}

