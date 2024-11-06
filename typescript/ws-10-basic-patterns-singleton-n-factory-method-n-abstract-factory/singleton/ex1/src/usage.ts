import {Singleton} from './Singleton'

console.log("works")

// Usage
const instance1 = Singleton.getInstance();
const instance2 = Singleton.getInstance();

instance1.someMethod();

console.log(instance1 === instance2); // Output: true, indicating that both variables refer to the same instance.
