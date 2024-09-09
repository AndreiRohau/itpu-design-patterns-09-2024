package com.arohau.Favoring_Composition_Over_Inheritance;

public class Main {
    /*
    Oh, Jellyfish ruins our design since we have to override produce sound, while fish can not produce it!
     */
    public static void main(String[] args) {
        Pet pet = initRandomPet();
        pet.produceVoice();
    }

    private static Pet initRandomPet() {
        int animalsNumber = 4;
        double random = Math.random() * animalsNumber;
        int num = (int) random;
        Pet o = null;
        switch (num) {
            case 0 -> o = new Cat();
            case 1 -> o = new Dog();
            case 2 -> o = new Duck();
            case 3 -> o = new Jellyfish();
        }
        return o;
    }
}
