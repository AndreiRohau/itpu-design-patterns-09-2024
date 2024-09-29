package com.arohau.ex4;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class WeatherStation {
    private final Thermometer thermometerModel;
    private final Hygrometer hygrometerModel;
    private final List<Observer> observers;

    public WeatherStation() {
        thermometerModel = new Thermometer();
        hygrometerModel = new Hygrometer();
        observers = new ArrayList<>();
    }

    // region work with Thermometer part
    public void writeCelsius(double celsius) {
        thermometerModel.setCelsius(celsius);
        notifyObservers();
    }
    public double readCelsius() {
        return thermometerModel.getCelsius();
    }
    // Formula: (1°C × 9/5) + 32 = 33.8°F
    public double readFahrenheit() {
        return (thermometerModel.getCelsius() * 9/5) + 32;
    }
    // Formula: 1°C + 273.15 = 274.15K
    public double readKelvin() {
        return thermometerModel.getCelsius() + 273.15;
    }
    // endregion

    // region work with Hygrometer part
    public void writeHumidity(double humidity) {
        hygrometerModel.setHumidity(humidity);
        notifyObservers();
    }
    public double readHumidity() {
        return hygrometerModel.getHumidity();
    }
    // endregion

    // todo how to improve this to make it not be dependant of Details?
    public void writeCelsiusAndWriteHumidity(Double celsius, Double humidity) {
        if (nonNull(celsius)) {
            thermometerModel.setCelsius(celsius);
        }
        if (nonNull(celsius)) {
            hygrometerModel.setHumidity(humidity);
        }
        notifyObservers();
    }

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

