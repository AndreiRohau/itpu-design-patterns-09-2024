console.log("works")  

// define business specific Interfaces and implement Classes
interface Chair {
    sitOn(): string;
}
interface Table {
    placeItems(): string;
}
class WoodenChair implements Chair {
    sitOn(): string {
        return "Sitting on a Wooden chair";
    }
}
class WoodenTable implements Table {
    placeItems(): string {
        return "Placing items on a Wooden table";
    }
}
class PlasticChair implements Chair {
    sitOn(): string {
        return "Sitting on a Plastic chair";
    }
}
class PlasticTable implements Table {
    placeItems(): string {
        return "Placing items on a Plastic table";
    }
}
// define interface Factory and implement Factories
interface FurnitureFactory {
    createChair(): Chair;
    createTable(): Table;
}
class WoodenFurnitureFactory implements FurnitureFactory {
    createChair(): Chair {
        return new WoodenChair();
    }
    createTable(): Table {
        return new WoodenTable();
    }
}
class PlasticFurnitureFactory implements FurnitureFactory {
    createChair(): Chair {
        return new PlasticChair();
    }
    createTable(): Table {
        return new PlasticTable();
    }
}

// The Abstract Factory class
class FurnitureFactory {
    static createFurnitureFactory(type: string): FurnitureFactory {
        if (type === "wooden") {
            return new WoodenFurnitureFactory();
        } else if (type === "plastic") {
            return new PlasticFurnitureFactory();
        } else {
            throw new Error("Invalid FurnitureFactory type.");
        }
    }
}

// check the process:
function createFurnitureOfType(type: string) {
    const factory: FurnitureFactory = FurnitureFactory.createFurnitureFactory(type);
    const chair = factory.createChair();
    const table = factory.createTable();

    console.log(chair.sitOn());
    console.log(table.placeItems());
}

createFurnitureOfType("wooden"); // Output: "Sitting on a Wooden chair", "Placing items on a Wooden table"

createFurnitureOfType("plastic"); // Output: "Sitting on a Plastic chair", "Placing items on a Plastic table"