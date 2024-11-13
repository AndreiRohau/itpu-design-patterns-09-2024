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
    orderName
    orderId
    constructor(...args) {
        // validate proper argument is passed
        this.orderName = args[0]
        this.orderId = args[1]
    }
    execute(orders): void {
        orders.push(this.orderId);
        console.log(`You have successfully ordered ${this.orderName} (${this.orderId})`);
    }
}

class TrackOrderCommand implements Command {
    orderId
    constructor(...args) {
        // validate proper argument is passed
        this.orderId = args[0]
    }
    execute(orders): void {
        console.log(`Your order ${this.orderId} will arrive in 20 minutes.`)
    }
}

class CancelOrderCommand implements Command {
    orderId
    constructor(...args) {
        // validate proper argument is passed
        this.orderId = args[0]
    }
    execute(orders): void {
        orders = orders.filter(order => {
                for (let i = 0; i < orders.length; i++) {
                    if (orders[i] === this.orderId) {
                        orders.splice(i, 1);
                        i--; // Adjust the index since we've modified the array
                    }
                }
            });
        console.log(`You have canceled your order ${this.orderId}`);
    }
}

// process starts:
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