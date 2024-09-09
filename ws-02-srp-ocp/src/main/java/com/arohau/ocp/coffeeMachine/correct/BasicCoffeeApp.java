package com.arohau.ocp.coffeeMachine.correct;

import com.arohau.ocp.coffeeMachine.correct.domain.Coffee;
import com.arohau.ocp.coffeeMachine.correct.domain.CoffeeSelection;

public class BasicCoffeeApp {

    private BasicCoffeeMachine coffeeMachine;

    public BasicCoffeeApp(BasicCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee prepareCoffee(CoffeeSelection selection) throws CoffeeException {
        Coffee coffee = this.coffeeMachine.brewCoffee(selection);
        System.out.println("Coffee is ready!");
        return coffee;
    }
} // end CoffeeApp

