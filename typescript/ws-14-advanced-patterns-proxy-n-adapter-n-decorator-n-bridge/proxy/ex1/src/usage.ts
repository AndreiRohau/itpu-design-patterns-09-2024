console.log("works")  


const person = {
  name: "John Doe",
  age: 42,
  nationality: "American"
};

const personProxy = new Proxy(person, {
  get: (object, prop) => {
    console.log('proxy get', prop);
    return Reflect.get(object, prop)
  },
  set: (object, prop, value) => {
    console.log(`proxy set ${String(prop)} = ` + value);
    return Reflect.set(object, prop, value);
  }
});

let result = personProxy.name
console.log('name = ', result)
console.log('----')

personProxy.age = 43
result = personProxy.age.toString()
console.log('age = ' + result)
console.log('----')

personProxy.name = "Jane Doe"
result = personProxy.name
console.log('name = ', result)