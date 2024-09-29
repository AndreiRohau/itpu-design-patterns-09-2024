package com.arohau.ex2;

public class WeatherView {
    public void displayTemperature(double celsius, double fahrenheit, double kelvin) {
        System.out.println("Temperature:");
        System.out.printf("\t%g Celsius\n", celsius);
        System.out.printf("\t%g Fahrenheit\n", fahrenheit);
        System.out.printf("\t%g Kelvin\n", kelvin);
    }
}
