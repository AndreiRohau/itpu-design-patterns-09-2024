package com.arohau.ocp.coffeeMachine.correct.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coffee {
    private String look;
    private String smellsLike;
    private int size;
}
