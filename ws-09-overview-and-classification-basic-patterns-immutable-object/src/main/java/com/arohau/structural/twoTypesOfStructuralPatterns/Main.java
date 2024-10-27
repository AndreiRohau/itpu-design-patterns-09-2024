package com.arohau.structural.twoTypesOfStructuralPatterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("IS-A (Class patterns) and HAS-A (Object patterns)");

        Vehicle aCar = new SportCar(new Engine("ELECTRIC"));
        System.out.println("SportCar is-a Vehicle == " + (aCar instanceof Vehicle));

        System.out.println("SportCar has-an Engine == " + (aCar.getEngine() != null));
        System.out.println("Engine is " + aCar.getEngine());
    }
}
