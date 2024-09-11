package com.arohau.Favoring_Composition_Over_Inheritance.correct;

public class BehaviourVoiceableHelloWorld implements BehaviourVoiceable {
    @Override
    public void produceVoice() {
        System.out.println("Hello world");
    }
}
