package com.arohau.ocp.coffeeMachine.correct;

import com.arohau.ocp.coffeeMachine.correct.domain.Coffee;
import com.arohau.ocp.coffeeMachine.correct.domain.CoffeeSelection;
import com.arohau.ocp.coffeeMachine.correct.domain.GroundCoffee;

public class BrewingUnit {
    public Coffee brew(CoffeeSelection filterCoffee, GroundCoffee groundCoffee, int quantityWater) {
        return new Coffee(filterCoffee.name(), groundCoffee.getName(), quantityWater);
    }
}
