import { Rectangle } from './Rectangle.js';
import { Square } from './Square.js';

// expected behaviour
const rect: Rectangle = new Square(10); // Can be either a Rectangle or a Square
rect.setWidth(20);
expect(rect.getArea()).toBe(200); // ❌ If rect is a Square, area is 400

// Rectangle assumes an area of 200. Square breaks that behavior by expecting an area of 400. Therefore, Rectangle and Square are not substitutable.

// improved code
// const rect: Rectangle = new Square(10);
// rect.setWidth(20);
// if (rect instanceof Square) {
//   // ...
// } else {
//   // ...
// }
