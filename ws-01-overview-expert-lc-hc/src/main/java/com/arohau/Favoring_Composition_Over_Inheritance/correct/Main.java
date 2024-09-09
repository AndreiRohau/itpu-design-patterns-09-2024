package com.arohau.Favoring_Composition_Over_Inheritance.correct;

public class Main {
    /*
    interface Pet is implemented already, and we can even encapsulate Dog.bark() method make it private
     */
    public static void main(String[] args) {
        Object pet = initRandomPet();
        System.out.println(pet.getClass().getSimpleName());
        BehaviourVoiceable behaviourVoiceable = ((AbstractCreature) pet).getBehaviourVoiceable();
        if (behaviourVoiceable != null) {
            behaviourVoiceable.produceVoice();
        } else {
            System.out.println("This creature does not produce Voice !");
        }
    }

    private static Object initRandomPet() {
        int animalsNumber = 5;
        double random = Math.random() * animalsNumber;
        int num = (int) random;
        Object o = null;
        switch (num) {
            case 0 -> o = new Cat(new BehaviourVoiceableMeow());
            case 1 -> o = new Dog(new BehaviourVoiceableBark());
            case 2 -> o = new Duck(new BehaviourVoiceableQuack());
            case 3 -> o = new Jellyfish();
            case 4 -> o = new WildCat(new BehaviourVoiceableMeow());
        }
        return o;
    }
}
