export interface Builder {
    setSeats(seats: number): this
    setEngine(engine: string): this
}

class Car {
    private _seats: number = 0
    private _engine: string

    constructor() {}

    set seats(seats) {
        this._seats = seats
    }

    set engine(engine) {
        this._engine = engine
    }
}

class CarBuilder implements Builder {
    private _car: Car

    constructor() {
        this._car = new Car()
    }

    public setSeats(seats: number): this {
        this._car.seats = seats
        return this
    }

    public setEngine(engine: string): this {
        this._car.engine = engine
        return this
    }

    public getResult(): Car {
        return this._car
    }
}

class Motorcycle {
    private _seats: number = 0
    private _engine: string

    constructor() {}

    set seats(seats) {
        this._seats = seats
    }

    set engine(engine) {
        this._engine = engine
    }
}

class MotorcycleBuilder implements Builder {
    private motorcycle: Motorcycle

    constructor() {
        this.motorcycle = new Motorcycle()
    }

    public setSeats(seats: number): this {
        this.motorcycle.seats = seats
        return this
    }

    public setEngine(engine: string): this {
        this.motorcycle.engine = engine
        return this
    }

    public getResult(): Motorcycle {
        return this.motorcycle
    }
}

export function run() {
    const car = new CarBuilder()
        .setSeats(4)
        .setEngine("V-12")
        .getResult()

    const motorcycle = new MotorcycleBuilder()
        .setSeats(2)
        .setEngine("V-4")
        .getResult()

      console.log(car)
      console.log(motorcycle)
}
