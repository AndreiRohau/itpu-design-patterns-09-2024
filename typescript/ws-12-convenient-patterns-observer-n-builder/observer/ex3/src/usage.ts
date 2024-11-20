import {Publisher} from './Publisher'

console.log("works")


const publisher = new Publisher('BASIC STATE');

// Returns a function which, when called, unsubscribes from the publisher.
const unsubscribe = publisher.subscribe(data => {
  console.log("SingleSubscribe", data);
});

const subscriberA = publisher.subscribe(data => console.log("subscriberA informed about data: ", data));
const subscriberB = data => console.log("subscriberB informed about data: ", data);

// Returns an array of unsubscribe functions
publisher.subscribe([subscriberA, subscriberB]);

publisher.set(10);
console.log('----')


// To unsubscribe the observer
unsubscribe() // unsubscribed
subscriberA() // unsubscribed
publisher.set(20);