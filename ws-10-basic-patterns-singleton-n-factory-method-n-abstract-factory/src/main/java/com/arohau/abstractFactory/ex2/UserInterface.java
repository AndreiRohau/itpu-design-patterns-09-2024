package com.arohau.abstractFactory.ex2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserInterface {
    private Button button;
    private ScrollBar scrollBar;

    @Override
    public String toString() {
        return "UserInterface{" +
                "button=" + button.getColor() +
                ", scrollBar=" + scrollBar.getColor() +
                '}';
    }
}
