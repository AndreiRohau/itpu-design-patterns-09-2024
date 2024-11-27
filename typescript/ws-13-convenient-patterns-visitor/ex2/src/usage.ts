console.log("works")  

interface VehicleInspectorVisitor {
    visitCar(car: Car): void
    visitVan(van: Van): void
    visitMotorbike(motorbike: Motorbike): void
    visitOwner(owner: VehicleOwner): void
}

class VehicleInspectorVisitorImpl implements VehicleInspectorVisitor {
    visitCar(car: Car): void {
        console.log(`Visiting ${car.constructor.name} with VehicleInspectorVisitorImpl`)
    }
    visitVan(van: Van): void {
        console.log(`Visiting ${van.constructor.name} with VehicleInspectorVisitorImpl`)
    }
    visitMotorbike(motorbike: Motorbike): void {
        console.log(`Visiting ${motorbike.constructor.name} with VehicleInspectorVisitorImpl`)
    }
    visitOwner(owner: VehicleOwner): void {
        console.log(`Visiting ${owner.constructor.name} with VehicleInspectorVisitorImpl`)
        for (const vehicle of owner.vehicles) {
            vehicle.accept(this)
        }
    }
}

interface VehicleElement {
    accept(visitor: VehicleInspectorVisitor): void
}

class Car implements VehicleElement {
    accept(visitor: VehicleInspectorVisitor): void {
        return visitor.visitCar(this)
    }
}

class Van implements VehicleElement {
    accept(visitor: VehicleInspectorVisitor): void {
        return visitor.visitVan(this)
    }
}

class Motorbike implements VehicleElement {
    accept(visitor: VehicleInspectorVisitor): void {
        return visitor.visitMotorbike(this)
    }
}

class VehicleOwner {
    private _vehicles: VehicleElement[] = []
    get vehicles() {
        return this._vehicles
    }
    add(vehicle: VehicleElement): void {
        this._vehicles.push(vehicle)
    }

    accept(visitor: VehicleInspectorVisitor): void {
        return visitor.visitOwner(this)
    }
}

// check it:
const owner = new VehicleOwner();
owner.add(new Car())
owner.add(new Van())
owner.add(new Motorbike())

const visitor: VehicleInspectorVisitor = new VehicleInspectorVisitorImpl();
owner.accept(visitor);
