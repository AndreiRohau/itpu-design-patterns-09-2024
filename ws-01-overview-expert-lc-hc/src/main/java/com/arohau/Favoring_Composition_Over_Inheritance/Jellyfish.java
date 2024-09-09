package com.arohau.Favoring_Composition_Over_Inheritance;

public class Jellyfish extends AbstractCreature implements Pet {
    @Override
    public void produceVoice() {
        System.out.println("jellyfish - making you feel ashamed with such a design");
    }
}
