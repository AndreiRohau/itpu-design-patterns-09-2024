package com.arohau.Favoring_Composition_Over_Inheritance.correct;

import com.arohau.Favoring_Composition_Over_Inheritance.correct.AbstractCreature;

public class Elephant extends AbstractCreature {
    public Elephant(BehaviourVoiceable behaviourVoiceable) {
        this.behaviourVoiceable = behaviourVoiceable;
    }
}
