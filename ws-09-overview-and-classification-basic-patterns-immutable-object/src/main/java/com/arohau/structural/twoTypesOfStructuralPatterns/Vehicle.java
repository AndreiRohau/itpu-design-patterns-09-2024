package com.arohau.structural.twoTypesOfStructuralPatterns;

import lombok.Data;

@Data
public class Vehicle {
    private Engine engine;

    public Vehicle() {
    }

    public Vehicle(Engine engine) {
        this.engine = engine;
    }
}
