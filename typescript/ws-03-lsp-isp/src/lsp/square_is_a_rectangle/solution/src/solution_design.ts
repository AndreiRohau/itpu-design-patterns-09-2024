// EXAMPLE
// interface Shape {
//   getArea: () => number;
// }
//
// interface Rectangle extends Shape {
//   width: number;
//   length: number;
// }
//
// interface Square extends Shape {
//   sides: number;
// }
//
// // Implementation of classes...
//
// // expected behaviour
// const rect1: Shape = new Rectangle(10, 20);
// const rect2: Shape = new Square(20);
//
// expect(rect.getArea()).toBe(200);
// expect(rect.getArea()).toBe(400);