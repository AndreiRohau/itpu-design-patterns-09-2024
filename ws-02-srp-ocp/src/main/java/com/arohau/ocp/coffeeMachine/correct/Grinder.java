package com.arohau.ocp.coffeeMachine.correct;

import com.arohau.ocp.coffeeMachine.correct.domain.CoffeeBean;
import com.arohau.ocp.coffeeMachine.correct.domain.GroundCoffee;

public class Grinder {
    public GroundCoffee grind(CoffeeBean coffeeBean, int quantityCoffee) {
        return new GroundCoffee(coffeeBean.getName(), quantityCoffee);
    }
}
