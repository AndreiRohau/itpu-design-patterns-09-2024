package com.arohau.Encapsulate_what_varies;

public class Main {
    /*
    interface Pet is implemented already, and we can even encapsulate Dog.bark() method make it private
     */
    public static void main(String[] args) {
        Pet pet = initRandomPet();

        pet.produceVoice();

    }

    private static Pet initRandomPet() {
        int animalsNumber = 5;
        double random = Math.random() * animalsNumber;
        int num = (int) random;
        Pet o = null;
        switch (num) {
            case 0 -> o = new Cat();
            case 1 -> o = new Dog();
            case 2 -> o = new Duck();
            case 3 -> o = new Raven();
            case 4 -> o = new Elephant();
        }
        return o;
    }
}
