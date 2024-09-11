package com.arohau.Encapsulate_what_varies;

public class Elephant implements Pet {
    @Override
    public void produceVoice() {
        System.out.println("Elephant - hello world");
    }
}
