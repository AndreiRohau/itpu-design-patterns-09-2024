console.log("works")

import {CarBuilder} from './Domain'
import {MotorcycleBuilder} from './Domain'
import {Car} from './Domain'
import {Motorcycle} from './Domain'
import {Director} from './Director'

// test
const car = new CarBuilder()
    .setSeats(4)
    .setEngine("V-12")
    .getResult()

const motorcycle = new MotorcycleBuilder()
    .setSeats(2)
    .setEngine("V-4")
    .getResult()

console.log(car)
console.log(motorcycle)
console.log('----------------------------')



const director = new Director();

let car1: Car = director.buildFerrari();
let car2: Car = director.buildToyota();
let car3: Motorcycle = director.buildHonda();
let car4: Motorcycle = director.buildYamaha();

console.log(car1)
console.log(car2)
console.log(car3)
console.log(car4)