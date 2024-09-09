package com.arohau.ocp.coffeeMachine.correct.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CoffeeBean {
    private String name;
    private int quantity;
}
