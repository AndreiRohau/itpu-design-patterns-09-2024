package com.arohau.Favoring_Composition_Over_Inheritance.correct;

public class WildCat extends AbstractCreature {
    public WildCat(BehaviourVoiceable behaviourVoiceable) {
        this.behaviourVoiceable = behaviourVoiceable;
    }
}
