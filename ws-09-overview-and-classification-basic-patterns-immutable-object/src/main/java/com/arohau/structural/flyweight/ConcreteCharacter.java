package com.arohau.structural.flyweight;

// Concrete flyweight class
public class ConcreteCharacter implements DisplayableCharacter {
    private char character;

    public ConcreteCharacter(char character) {
        this.character = character;
    }

    public void display(int positionX, int positionY) {
        System.out.println("Character " + character + " displayed at position (" + positionX + ", " + positionY + ")");
    }
}
