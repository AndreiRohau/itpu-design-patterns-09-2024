package com.arohau.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory
public class CharacterFactory {
    private Map<Character, DisplayableCharacter> characterMap = new HashMap<>();

    public DisplayableCharacter getCharacter(char key) {
        if (!characterMap.containsKey(key)) {
            characterMap.put(key, new ConcreteCharacter(key));
        }
        return characterMap.get(key);
    }
}
