package com.arohau.ocp.coffeeMachine.correct;

import com.arohau.ocp.coffeeMachine.correct.domain.Coffee;
import com.arohau.ocp.coffeeMachine.correct.domain.CoffeeBean;
import com.arohau.ocp.coffeeMachine.correct.domain.CoffeeSelection;
import com.arohau.ocp.coffeeMachine.correct.domain.GroundCoffee;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        baseCoffee();
        premiumCoffee();
    }

    public static void baseCoffee() {
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

    public static void premiumCoffee() {
        // create a Map of available coffee beans
        Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
        beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean(
                "My favorite espresso bean", 1000));
        beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean(
                "My favorite filter coffee bean", 1000));

        // get a new CoffeeMachine object
        PremiumCoffeeMachine machine = new PremiumCoffeeMachine(beans);

        // Instantiate CoffeeApp
        CoffeeApp app = new CoffeeApp(machine);

        // brew a fresh coffee
        try {
            Coffee coffee = app.prepareCoffee(CoffeeSelection.ESPRESSO);
            System.out.println("Check results:");
            System.out.println(coffee.toString());
        } catch (CoffeeException e) {
            e.printStackTrace();
        }
    } // end main
}
