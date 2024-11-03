package com.arohau.abstractFactory.ex1;

public class RoadBikeFactory implements BikeFactory {
    @Override
    public Handlebars createHandlebars() {
        return new RoadBikeHandlebars();
    }

    @Override
    public Pedals createPedals() {
        return new RoadBikePedals();
    }

    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }
}