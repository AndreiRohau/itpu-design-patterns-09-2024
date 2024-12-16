console.log("works")  
console.log("Imperative impl")

class PaymentProcessor {
    strategy
    constructor(strategy) {
        this.strategy = strategy;
    }

    processPayment(amount) {
        this.strategy.pay(amount);
    }
}

class PayPalPayment {
    pay(amount) {
        console.log(`Processing a payment of ${amount} using PayPal.`);
    }
}

class CreditCardPayment {
    pay(amount) {
        console.log(`Processing a payment of ${amount} using Credit Card.`);
    }
}

class BitcoinPayment {
    pay(amount) {
        console.log(`Processing a payment of ${amount} using Bitcoin.`);
    }
}

const payPalPayment = new PaymentProcessor(new PayPalPayment());
const creditCardPayment = new PaymentProcessor(new CreditCardPayment());
const bitcoinPayment = new PaymentProcessor(new BitcoinPayment());

payPalPayment.processPayment(100); // Processing a payment of 100 using PayPal.
creditCardPayment.processPayment(200); // Processing a payment of 200 using Credit Card.
bitcoinPayment.processPayment(300); // Processing a payment of 300 using Bitcoin.