package com.arohau.Favoring_Composition_Over_Inheritance.correct;

public class Duck extends AbstractCreature {
    public Duck(BehaviourVoiceable behaviourVoiceable) {
        this.behaviourVoiceable = behaviourVoiceable;
    }
}
