package com.arohau.structural.twoTypesOfStructuralPatterns;

import lombok.Data;

@Data
public class SportCar extends Vehicle {
    public SportCar(Engine engine) {
        super(engine);
    }
}
