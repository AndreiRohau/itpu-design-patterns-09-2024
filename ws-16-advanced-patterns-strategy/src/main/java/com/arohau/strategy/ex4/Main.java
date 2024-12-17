package com.arohau.strategy.ex4;

// [STRATEGY] interface == TravelStrategy.java
interface TravelStrategy {
    void travel(String source, String destination);
}

// [CONCRETE_STRATEGY] == CarTravelStrategy.java
class CarTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String source, String destination) {
        System.out.println("Traveling by car from " + source + " to " + destination);
    }
}

// [CONCRETE_STRATEGY] == BicycleTravelStrategy.java
class BicycleTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String source, String destination) {
        System.out.println("Traveling by bicycle from " + source + " to " + destination);
    }
}

// [CONCRETE_STRATEGY] == WalkingTravelStrategy.java
class WalkingTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String source, String destination) {
        System.out.println("Traveling on foot from " + source + " to " + destination);
    }
}

// [CONTEXT] == TravelPlanner.java
class TravelPlanner {
    private TravelStrategy travelStrategy;

    public TravelPlanner(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void planTravel(String source, String destination) {
        travelStrategy.travel(source, destination);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        TravelPlanner travelPlanner = new TravelPlanner(new CarTravelStrategy());

        // Plan travel by car
        travelPlanner.planTravel("Home", "Office");

        // Change strategy to bicycle
        travelPlanner.setTravelStrategy(new BicycleTravelStrategy());
        // Plan travel by bicycle
        travelPlanner.planTravel("Office", "Park");

        // Change strategy to walking
        travelPlanner.setTravelStrategy(new WalkingTravelStrategy());
        // Plan travel by walking
        travelPlanner.planTravel("Park", "Restaurant");
    }
}

