import {Car, CarBuilder, Motorcycle, MotorcycleBuilder} from './Domain'

export class Director {
    public buildFerrari(): Car {
        return new CarBuilder().setSeats(2).setEngine("V-12").getResult();
    }

    public buildToyota(): Car {
        return new CarBuilder().setSeats(7).setEngine("V-6").getResult();
    }

    public buildHonda(): Motorcycle {
        return new MotorcycleBuilder().setSeats(2).setEngine("V-4").getResult();
    }

    public buildYamaha(): Motorcycle {
        return new MotorcycleBuilder().setSeats(1).setEngine("V-2").getResult();
    }
}