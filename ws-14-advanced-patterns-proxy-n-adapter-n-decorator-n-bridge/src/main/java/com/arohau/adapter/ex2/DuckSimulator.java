package com.arohau.adapter.ex2;

public class DuckSimulator {
    public static void main(String[] args) {
        // Test a duck
        Duck duck = new MallardDuck();
        testDuck(duck);

        //Test a drone
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    // THE GOAL IS TO REUSE THIS METHOD
    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
