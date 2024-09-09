package com.arohau.ocp.coffeeMachine;

import com.arohau.ocp.coffeeMachine.domain.Coffee;
import com.arohau.ocp.coffeeMachine.domain.CoffeeSelection;
import com.arohau.ocp.coffeeMachine.domain.GroundCoffee;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // create a Map of available coffee beans
        Map<CoffeeSelection, GroundCoffee> beans = new HashMap<>();
        beans.put(CoffeeSelection.FILTER_COFFEE, new GroundCoffee("My favorite filter coffee bean", 1000));

        // get a new CoffeeMachine object
        BasicCoffeeMachine machine = new BasicCoffeeMachine(beans);

        // Instantiate CoffeeApp
        BasicCoffeeApp app = new BasicCoffeeApp(machine);

        // brew a fresh coffee
        try {
            Coffee coffee = app.prepareCoffee(CoffeeSelection.FILTER_COFFEE);
            System.out.println("Check results: ");
            System.out.println(coffee.toString());
        } catch (CoffeeException e) {
            e.printStackTrace();
        }
    } // end main
}
