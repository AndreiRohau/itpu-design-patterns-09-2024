package com.arohau.abstractFactory.ex1;

public class MountainBikeFactory implements BikeFactory {
    @Override
    public Handlebars createHandlebars() {
        return new MountainBikeHandlebars();
    }

    @Override
    public Pedals createPedals() {
        return new MountainBikePedals();
    }

    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }
}
