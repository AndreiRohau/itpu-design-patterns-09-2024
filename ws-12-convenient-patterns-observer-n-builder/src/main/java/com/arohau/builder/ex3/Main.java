package com.arohau.builder.ex3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder().colour("red")
                .fuelType("Petrol")
                .make("Ford")
                .model("F")
                .build();

        System.out.println(car);
    }
}
