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
    return Math.PI * Math.pow(circle.radius, 2);
  }
  visitSquare(square) {
    return Math.pow(square.side, 2);
  }
  visitTriangle(triangle) {
    // Assuming Heron's formula for triangle area calculation
    const s = (triangle.sideA + triangle.sideB + triangle.sideC) / 2;
    return Math.sqrt(s * (s - triangle.sideA) * (s - triangle.sideB) * (s - triangle.sideC));
  }
}

class PerimeterCalculator extends ShapeVisitor {
  visitCircle(circle) {
    return 2 * Math.PI * circle.radius;
  }
  visitSquare(square) {
    return 4 * square.side;
  }
  visitTriangle(triangle) {
    return triangle.sideA + triangle.sideB + triangle.sideC;
  }
}

// Visitable Elements
class Circle {
  radius
  constructor(radius) {
    this.radius = radius;
  }

  accept(visitor) {
    return visitor.visitCircle(this);
  }
}

class Square {
  side
  constructor(side) {
    this.side = side;
  }

  accept(visitor) {
    return visitor.visitSquare(this);
  }
}

class Triangle {
  sideA
  sideB
  sideC
  constructor(sideA, sideB, sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  accept(visitor) {
    return visitor.visitTriangle(this);
  }
}

// Usage
const circle = new Circle(5);
const square = new Square(4);
const triangle = new Triangle(3, 4, 5);

const areaCalculator = new AreaCalculator();
const perimeterCalculator = new PerimeterCalculator();

const circleArea = circle.accept(areaCalculator);
const squarePerimeter = square.accept(perimeterCalculator);
const triangleArea = triangle.accept(areaCalculator);

console.log(`Circle Area: ${circleArea}`);
console.log(`Square Perimeter: ${squarePerimeter}`);
console.log(`Triangle Area: ${triangleArea}`);