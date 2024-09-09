package com.arohau.ocp.coffeeMachine.correct;

import com.arohau.ocp.coffeeMachine.correct.domain.Coffee;
import com.arohau.ocp.coffeeMachine.correct.domain.CoffeeSelection;

public interface CoffeeMachine {
    Coffee brewCoffee(CoffeeSelection selection) throws CoffeeException;
}
