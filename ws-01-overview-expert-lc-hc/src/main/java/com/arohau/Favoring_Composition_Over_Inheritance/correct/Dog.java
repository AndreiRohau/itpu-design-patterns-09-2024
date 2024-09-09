package com.arohau.Favoring_Composition_Over_Inheritance.correct;

public class Dog extends AbstractCreature {
    public Dog(BehaviourVoiceable behaviourVoiceable) {
        this.behaviourVoiceable = behaviourVoiceable;
    }
}
