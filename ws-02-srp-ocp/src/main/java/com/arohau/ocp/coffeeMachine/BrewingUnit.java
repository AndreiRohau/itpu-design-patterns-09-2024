package com.arohau.ocp.coffeeMachine;

import com.arohau.ocp.coffeeMachine.domain.Coffee;
import com.arohau.ocp.coffeeMachine.domain.CoffeeSelection;
import com.arohau.ocp.coffeeMachine.domain.GroundCoffee;

public class BrewingUnit {
    public Coffee brew(CoffeeSelection filterCoffee, GroundCoffee groundCoffee, int quantityWater) {
        return new Coffee(filterCoffee.name(), groundCoffee.getName(), quantityWater);
    }
}
