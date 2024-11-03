package com.arohau.abstractFactory.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {
    private static final Map<String, Supplier<BikeFactory>> bikeTypes = new HashMap<>();
    static {
        bikeTypes.put("ROAD", RoadBikeFactory::new);
        bikeTypes.put("MOUNTAIN", MountainBikeFactory::new);
    }

    public static BikeFactory createFactory(String bikeType) {
        if (bikeTypes.get(bikeType) != null) {
            return bikeTypes.get(bikeType).get();
        } else {
            throw new IllegalArgumentException("Bike type not supported");
        }

    }
}
