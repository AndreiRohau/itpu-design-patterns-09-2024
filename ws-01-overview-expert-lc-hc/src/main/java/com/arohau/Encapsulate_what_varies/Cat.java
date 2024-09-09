package com.arohau.Encapsulate_what_varies;

public class Cat extends AbstractCreature implements Pet {

    @Override
    public void produceVoice() {
        meow();
    }

    public void meow() {
        System.out.println("cat - meow");
    }
}
