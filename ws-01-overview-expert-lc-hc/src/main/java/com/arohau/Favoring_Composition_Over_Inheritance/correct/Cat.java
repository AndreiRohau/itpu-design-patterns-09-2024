package com.arohau.Favoring_Composition_Over_Inheritance.correct;

public class Cat extends AbstractCreature {
    public Cat(BehaviourVoiceable behaviourVoiceable) {
        this.behaviourVoiceable = behaviourVoiceable;
    }
}
