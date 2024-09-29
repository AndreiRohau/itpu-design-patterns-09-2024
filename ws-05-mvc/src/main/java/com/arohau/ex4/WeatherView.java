package com.arohau.ex4;

public class WeatherView implements Observer {
    private final WeatherStation model;

    public WeatherView(WeatherStation model) {
        this.model = model;
        model.registerObserver(this);
    }

    public void update() {
        displayTemperature(model.readCelsius(), model.readFahrenheit(), model.readKelvin());
        displayHumidity(model.readHumidity());
        System.out.println("-".repeat(11));
    }

    private void displayTemperature(double celsius, double fahrenheit, double kelvin) {
        System.out.println("Temperature:");
        System.out.printf("\t%g Celsius\n", celsius);
        System.out.printf("\t%g Fahrenheit\n", fahrenheit);
        System.out.printf("\t%g Kelvin\n", kelvin);
    }

    private void displayHumidity(double humidity) {
        System.out.println("Humidity: " + humidity);
    }
}