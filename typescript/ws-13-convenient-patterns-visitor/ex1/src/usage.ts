console.log("works")  

interface VehicleInspector {
    visit(car: Car): void;
    visit(van: Van): void;
    visit(motorbike: Motorbike): void;
}

class CarInspector implements VehicleInspector {
    visit(car: Car): void {
        console.log(`Visiting ${car.constructor.name} with CarInspector`);
    }
}

class VanInspector implements VehicleInspector {
    visit(van: Van): void {
        console.log(`Visiting ${van.constructor.name} with VanInspector`);
    }
}

class MotorbikeInspector implements VehicleInspector {
    visit(motorbike: Motorbike): void {
        console.log(`Visiting ${motorbike.constructor.name} with MotorbikeInspector`);
    }
}

interface Vehicle {
  accept(vehicleInspector: VehicleInspector): void;
}

class Car implements Vehicle {
    accept(vehicleInspector: VehicleInspector): void {
        return vehicleInspector.visit(this)
    }
}

class Van implements Vehicle {
    accept(vehicleInspector: VehicleInspector): void {
        return vehicleInspector.visit(this)
    }
}

class Motorbike implements Vehicle {
    accept(vehicleInspector: VehicleInspector): void {
        return vehicleInspector.visit(this)
    }
}

let car = new Car();
let van = new Van();
let motorbike = new Motorbike();

let carInspector = new CarInspector();
car.accept(carInspector);

let vanInspector = new VanInspector();
van.accept(vanInspector);

let motorbikeInspector = new MotorbikeInspector();
motorbike.accept(motorbikeInspector);
