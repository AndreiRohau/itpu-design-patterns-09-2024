package com.arohau.Favoring_Composition_Over_Inheritance;

public class Duck extends AbstractCreature implements Pet {

    @Override
    public void produceVoice() {
        quack();
    }

    public void quack() {
        System.out.println("duck - quack");
    }
}
