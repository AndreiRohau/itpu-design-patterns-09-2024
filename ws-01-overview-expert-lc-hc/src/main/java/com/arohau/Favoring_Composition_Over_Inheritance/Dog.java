package com.arohau.Favoring_Composition_Over_Inheritance;

public class Dog extends AbstractCreature implements Pet {

    @Override
    public void produceVoice() {
        bark();
    }

    public void bark() {
        System.out.println("dog - bark");
    }
}
