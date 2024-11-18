interface Builder {
    setSeats(seats: number): this
    setEngine(engine: string): this
}

export class Car {
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

export class CarBuilder implements Builder {
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

export class Motorcycle {
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

export class MotorcycleBuilder implements Builder {
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
