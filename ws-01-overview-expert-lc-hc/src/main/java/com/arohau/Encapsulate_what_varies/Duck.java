package com.arohau.Encapsulate_what_varies;

public class Duck extends AbstractCreature implements Pet {

    @Override
    public void produceVoice() {
        quack();
    }

    public void quack() {
        System.out.println("duck - quack");
    }
}
