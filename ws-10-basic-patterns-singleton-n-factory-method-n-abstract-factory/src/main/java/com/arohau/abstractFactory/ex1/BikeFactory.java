package com.arohau.abstractFactory.ex1;

public interface BikeFactory {
    Handlebars createHandlebars();
    Pedals createPedals();
    Tire createTire();
}
