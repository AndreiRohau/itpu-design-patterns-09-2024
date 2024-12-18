console.log("works")  
console.log("Imperative impl")

// [CONTEXT]
class PaymentProcessor {
    strategy
    constructor(strategy) {
        this.strategy = strategy;
    }

    processPayment(amount) {
        this.strategy.pay(amount);
    }
}

// [CONCRETE STRATEGY]
class PayPalPayment {
    pay(amount) {
        console.log(`Processing a payment of ${amount} using PayPal.`);
    }
}

// [CONCRETE STRATEGY]
class CreditCardPayment {
    pay(amount) {
        console.log(`Processing a payment of ${amount} using Credit Card.`);
    }
}

// [CONCRETE STRATEGY]
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

console.log('----')
const ppp = new PayPalPayment()
const ccp = new CreditCardPayment()
const bp = new BitcoinPayment()

const contextPaymentProcessor = new PaymentProcessor(ppp)

contextPaymentProcessor.processPayment(111)
contextPaymentProcessor.strategy = ccp
contextPaymentProcessor.processPayment(222)
contextPaymentProcessor.strategy = bp
contextPaymentProcessor.processPayment(333)