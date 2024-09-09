package com.arohau.Encapsulate_what_varies;

public class Dog extends AbstractCreature implements Pet {

    @Override
    public void produceVoice() {
        bark();
    }

    public void bark() {
        System.out.println("dog - bark");
    }
}
