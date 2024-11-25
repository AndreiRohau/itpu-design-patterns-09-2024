console.log("works")  

// Visitor Interface
class ShapeVisitor {
  visitCircle(circle) {}
  visitSquare(square) {}
  visitTriangle(triangle) {}
}
// Concrete Visitors
class AreaCalculator extends ShapeVisitor {
  visitCircle(circle) {
    // Calculate and return the area of a circle.
    console.log('Calculating area of circle')
  }
  visitSquare(square) {
    // Calculate and return the area of a square.
    console.log('Calculating area of square')
  }
  visitTriangle(triangle) {
    // Calculate and return the area of a triangle.
    console.log('Calculating area of triangle')
  }
}

class PerimeterCalculator extends ShapeVisitor {
  visitCircle(circle) {
    // Calculate and return the perimeter of a circle.
    console.log('Calculating perimeter of circle')
  }
  visitSquare(square) {
    // Calculate and return the perimeter of a square.
    console.log('Calculating perimeter of square')
  }
  visitTriangle(triangle) {
    // Calculate and return the perimeter of a triangle.
    console.log('Calculating perimeter of triangle')
  }
}

// Visitable Elements
class Circle {
  accept(visitor) {
    visitor.visitCircle(this);
  }
}

class Square {
  accept(visitor) {
    visitor.visitSquare(this);
  }
}

class Triangle {
  accept(visitor) {
    visitor.visitTriangle(this);
  }
}

const areaCalculator = new AreaCalculator();
const perimeterCalculator = new PerimeterCalculator();

const circle = new Circle();
const square = new Square();
const triangle = new Triangle();

const circleArea = circle.accept(areaCalculator);
const squarePerimeter = square.accept(perimeterCalculator);
const triangleArea = triangle.accept(areaCalculator);

console.log('')
console.log('Now, you can use the Visitor pattern to calculate areas and perimeters of shapes without modifying their individual classes.\n' +
    'Note: In above example, the Visitor pattern allows you to perform different operations (calculating area and perimeter) on different \n' +
    'types of shapes without changing the shape classes themselves. \n' +
    'It promotes separation of concerns and extensibility in your code.')