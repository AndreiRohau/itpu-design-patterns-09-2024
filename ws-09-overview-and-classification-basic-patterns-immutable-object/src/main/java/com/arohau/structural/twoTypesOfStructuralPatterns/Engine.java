package com.arohau.structural.twoTypesOfStructuralPatterns;

import lombok.Data;

@Data
public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }
}
