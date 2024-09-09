package com.arohau.ocp.coffeeMachine;

import com.arohau.ocp.coffeeMachine.domain.Coffee;
import com.arohau.ocp.coffeeMachine.domain.CoffeeSelection;

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

