console.log("works")

class OrderManager {
    orders
    constructor() {
        this.orders = [];
    }

    execute(command) {
        return command.execute(this.orders);
    }

    printOrders() {
        console.log('Current orders: ', this.orders)
    }
}

abstract class Command {
    abstract execute(orders)
}

class PlaceOrderCommand implements Command {
    args
    constructor(...args) {
        this.args = args
    }
    execute(orders): void {
        orders.push(this.args[1]);
        console.log(`You have successfully ordered ${this.args[0]} (${this.args[1]})`);
    }
}

class TrackOrderCommand implements Command {
    args
    constructor(...args) {
        this.args = args
    }
    execute(orders): void {
        console.log(`Your order ${this.args[0]} will arrive in 20 minutes.`)
    }
}

class CancelOrderCommand implements Command {
    args
    constructor(...args) {
        this.args = args
    }
    execute(orders): void {
        orders = orders.filter(order => {
                for (let i = 0; i < orders.length; i++) {
                    if (orders[i] === this.args[0]) {
                        orders.splice(i, 1);
                        i--; // Adjust the index since we've modified the array
                    }
                }
            });
        console.log(`You have canceled your order ${this.args[0]}`);
    }
}

const manager = new OrderManager();

manager.printOrders()
manager.execute(new PlaceOrderCommand("Pad Thai", "1234"));
manager.printOrders()
manager.execute(new TrackOrderCommand("1234"));
manager.printOrders()
manager.execute(new PlaceOrderCommand("Mai Thai", "4444"));
manager.printOrders()
manager.execute(new CancelOrderCommand("1234"));
manager.printOrders()