package com.arohau.behavioral.mediator;

public enum Action {
    ENEMY("enemy"),
    TALE("tale"),
    GOLD("gold"),
    HUNT("hunt");

    private String description;

    Action(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
