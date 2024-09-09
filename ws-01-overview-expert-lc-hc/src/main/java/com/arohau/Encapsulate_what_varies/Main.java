package com.arohau.Encapsulate_what_varies;

public class Main {
    /*
    interface Pet is implemented already, and we can even encapsulate Dog.bark() method make it private
     */
    public static void main(String[] args) {
        Object pet = initRandomPet();
        ((Pet) pet).produceVoice();

    }

    private static Object initRandomPet() {
        int animalsNumber = 3;
        double random = Math.random() * animalsNumber;
        int num = (int) random;
        Object o = null;
        switch (num) {
            case 0 -> o = new Cat();
            case 1 -> o = new Dog();
            case 2 -> o = new Duck();
        }
        return o;
    }
}
