package com.arohau.observer.ex2;

public class App {

    public static void main(String[] args) {

        Location location1 = new Location();
        Location location2 = new Location();
        WeatherUpdates weatherUpdates = new WeatherUpdates();

        location1.addPropertyChangeListener(weatherUpdates);
        location2.addPropertyChangeListener(weatherUpdates);

        location1.setWeatherEvent("Risk of flooding");
        location2.setWeatherEvent("Risk of drought");

        weatherUpdates.printUpdates();
    }
}
