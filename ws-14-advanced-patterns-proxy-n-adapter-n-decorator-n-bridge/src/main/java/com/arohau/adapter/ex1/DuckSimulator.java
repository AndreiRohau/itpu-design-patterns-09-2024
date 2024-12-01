package com.arohau.adapter.ex1;

public class DuckSimulator {
    public static void main(String[] args) {
        // Test a duck
        Duck duck = new MallardDuck();
        testDuck(duck);

        //Test a turkey
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    // THE GOAL IS TO REUSE THIS METHOD
    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
