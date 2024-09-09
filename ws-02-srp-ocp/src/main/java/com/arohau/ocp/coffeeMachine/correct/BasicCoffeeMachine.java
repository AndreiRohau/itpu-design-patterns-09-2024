package com.arohau.ocp.coffeeMachine.correct;

import com.arohau.ocp.coffeeMachine.correct.domain.Coffee;
import com.arohau.ocp.coffeeMachine.correct.domain.CoffeeSelection;
import com.arohau.ocp.coffeeMachine.correct.domain.Configuration;
import com.arohau.ocp.coffeeMachine.correct.domain.GroundCoffee;

import java.util.HashMap;
import java.util.Map;

public class BasicCoffeeMachine implements CoffeeMachine {

    private final Map<CoffeeSelection, Configuration> configMap;
    private final Map<CoffeeSelection, GroundCoffee> groundCoffeeMap;
    private final BrewingUnit brewingUnit;

    public BasicCoffeeMachine(Map<CoffeeSelection, GroundCoffee> groundCoffeeMap) {
        this.groundCoffeeMap = groundCoffeeMap;
        this.brewingUnit = new BrewingUnit();

        this.configMap = new HashMap<>();
        this.configMap.put(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480));
    }

    @Override
    public Coffee brewCoffee(CoffeeSelection selection) {
        Configuration config = configMap.get(selection);

        // get the coffee
        GroundCoffee groundCoffee = this.groundCoffeeMap.get(selection);

        // brew a filter coffee
        return this.brewingUnit.brew(CoffeeSelection.FILTER_COFFEE, groundCoffee, config.getQuantityWater());
    }

    public void addGroundCoffee(CoffeeSelection selection, GroundCoffee newCoffee) throws CoffeeException {
        GroundCoffee existingCoffee = this.groundCoffeeMap.get(selection);
        if (existingCoffee != null) {
            if (existingCoffee.getName().equals(newCoffee.getName())) {
                existingCoffee.setQuantity(existingCoffee.getQuantity() + newCoffee.getQuantity());
            } else {
                throw new CoffeeException("Only one kind of coffee supported for each CoffeeSelection.");
            }
        } else {
            this.groundCoffeeMap.put(selection, newCoffee);
        }
    }
}

