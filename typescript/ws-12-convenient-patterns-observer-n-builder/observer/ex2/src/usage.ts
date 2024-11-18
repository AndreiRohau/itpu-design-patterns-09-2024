console.log("works")  

const observable = new Subject(10);
const observerA = new Observer(observable);
const observerB = new Observer(observable);

observerA.subscribe(data => {
  console.log("observerA", data);
});

observerB.subscribe(data => {
  console.log("observerB", data);
});

observable.setState(20);
observable.setState(30);
observable.setState(20);


/* Output
observerA 20
observerB 20
observerA 30
observerB 30
observerA 20
observerB 20
*/


