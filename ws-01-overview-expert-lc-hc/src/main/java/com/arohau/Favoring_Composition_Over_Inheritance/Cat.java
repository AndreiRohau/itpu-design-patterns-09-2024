package com.arohau.Favoring_Composition_Over_Inheritance;

public class Cat extends AbstractCreature implements Pet {

    @Override
    public void produceVoice() {
        meow();
    }

    public void meow() {
        System.out.println("cat - meow");
    }
}
