package com.arohau.abstractFactory.ex1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
public class Bike {
    private Handlebars handlebars;
    private Pedals pedals;
    private Tire frontTire;
    private Tire backTire;

    @Override
    public String toString() {
        return "Bike{" +
                "handlebars=" + handlebars.getType() +
                ", pedals=" + pedals.getType() +
                ", frontTire=" + frontTire.getWidth() +
                ", backTire=" + backTire.getWidth() +
                '}';
    }
}
