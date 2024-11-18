package com.arohau.builder.ex4;

public class Main {
    public static void main(String[] args) {
        Car.Builder<?> carBuilder = new Car.Builder();
        Car car = carBuilder.colour("red")
                .fuelType("Petrol")
                .make("Ford")
                .model("F")
                .build();

        ElectricCar.Builder<?> ElectricCarBuilder = new ElectricCar.Builder();
        ElectricCar eCar = ElectricCarBuilder.make("Mercedes")
                .colour("White")
                .model("G")
                .fuelType("Electric")
                .batteryType("Lithium")
                .build();

    System.out.println("assertEquals == " + "red".equals(car.getColour()));
    System.out.println("assertEquals == " + "Ford".equals(car.getMake()));

    System.out.println("assertEquals == " + "Electric".equals(eCar.getFuelType()));
    System.out.println("assertEquals == " + "Lithium".equals(eCar.getBatteryType()));
    }
}

