package com.arohau.Encapsulate_what_varies;

public class MainBad {
    /*
    interface Pet is not implemented yet
     */
    public static void main(String[] args) {
        Object pet = initRandomPet();

        // todo IDEA IS to get rid of this snippet since it may require changes everytime
        if (pet.getClass().equals(Dog.class)) {
            ((Dog) pet).bark();
        } else if (pet.getClass().equals(Cat.class)) {
            ((Cat) pet).meow();
        } else if (pet.getClass().equals(Duck.class)) {
            ((Duck) pet).quack();
        } else {
            System.out.println("How we get here?!");
        }
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
