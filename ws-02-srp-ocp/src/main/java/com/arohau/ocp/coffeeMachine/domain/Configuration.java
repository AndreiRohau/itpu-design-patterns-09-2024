package com.arohau.ocp.coffeeMachine.domain;

import lombok.Data;

@Data
public class Configuration {
    private int quantityCoffee;
    private int quantityWater;

    public Configuration(int quantityCoffee, int quantityWater) {
        this.quantityCoffee = quantityCoffee;
        this.quantityWater = quantityWater;
    }
}
