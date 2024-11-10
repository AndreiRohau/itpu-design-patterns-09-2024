// Define an interface for the type of objects the factory will create
interface Cellphone {
    use(): void;
}

// Concrete implementations of the Cellphone interface
class Iphone implements Cellphone {
    use(): void {
        console.log("Using iphone");
    }
}

class Galaxy implements Cellphone {
    use(): void {
        console.log("Using galaxy");
    }
}

// The Factory class
class CellphoneFactory {
    static createCellphone(type: string): Cellphone {
        if (type === "apple") {
            return new Iphone();
        } else if (type === "samsung") {
            return new Galaxy();
        } else {
            throw new Error("Invalid product type.");
        }
    }
}

// Using the factory to create products
const iphone: Cellphone = CellphoneFactory.createCellphone("apple");
iphone.use(); // Output: Using iphone

const galaxy: Cellphone = CellphoneFactory.createCellphone("samsung");
galaxy.use(); // Output: Using galaxy