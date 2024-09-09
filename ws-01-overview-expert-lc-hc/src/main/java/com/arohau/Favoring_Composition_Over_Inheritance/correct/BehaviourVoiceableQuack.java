package com.arohau.Favoring_Composition_Over_Inheritance.correct;

public class BehaviourVoiceableQuack implements BehaviourVoiceable {
    @Override
    public void produceVoice() {
        System.out.println("quack");
    }
}
