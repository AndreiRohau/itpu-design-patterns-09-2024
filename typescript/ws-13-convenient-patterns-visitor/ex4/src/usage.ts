console.log("works")  

// Visitor Interface
class ShapeVisitor {
    visitCircle(circle) {}
    visitSquare(square) {}
    visitTriangle(triangle) {}
    visitCompoundShape(triangle) {}
}

// Concrete Visitors
class AreaCalculator extends ShapeVisitor {
    visitCircle(circle) {
        console.log(`Visiting ${circle.constructor.name} with AreaCalculator`)
        return Math.PI * Math.pow(circle.radius, 2)
    }
    visitSquare(square) {
        console.log(`Visiting ${square.constructor.name} with AreaCalculator`)
        return Math.pow(square.side, 2)
    }
    visitTriangle(triangle) {
        console.log(`Visiting ${triangle.constructor.name} with AreaCalculator`)
        // Assuming Heron's formula for triangle area calculation
        const s = (triangle.sideA + triangle.sideB + triangle.sideC) / 2;
        return Math.sqrt(s * (s - triangle.sideA) * (s - triangle.sideB) * (s - triangle.sideC))
    }
    visitCompoundShape(compoundShape: CompoundShape) {
        console.log(`Visiting ${compoundShape.constructor.name} with AreaCalculator`)
        let result = 0
        for (const shape of compoundShape.shapes) {
            result += shape.accept(this)
        }
        return result
    }
}

class PerimeterCalculator extends ShapeVisitor {
    visitCircle(circle) {
        console.log(`Visiting ${circle.constructor.name} with AreaCalculator`)
        return 2 * Math.PI * circle.radius
    }
    visitSquare(square) {
        console.log(`Visiting ${square.constructor.name} with AreaCalculator`)
        return 4 * square.side
    }
    visitTriangle(triangle) {
        console.log(`Visiting ${triangle.constructor.name} with AreaCalculator`)
        return triangle.sideA + triangle.sideB + triangle.sideC
    }
    visitCompoundShape(compoundShape: CompoundShape) {
        console.log(`Visiting ${compoundShape.constructor.name} with PerimeterCalculator`)
        let result = 0
        for (const shape of compoundShape.shapes) {
            result += shape.accept(this)
        }
        return result
    }
}


// Visitable Elements
interface ElementShape {
    accept(visitor)
}

class Circle implements ElementShape {
    radius
    constructor(radius) {
        this.radius = radius
    }

    accept(visitor) {
        return visitor.visitCircle(this)
    }
}

class Square implements ElementShape {
    side
    constructor(side) {
        this.side = side
    }

    accept(visitor) {
        return visitor.visitSquare(this)
    }
}

class Triangle implements ElementShape {
    sideA
    sideB
    sideC
    constructor(sideA, sideB, sideC) {
        this.sideA = sideA
        this.sideB = sideB
        this.sideC = sideC
    }

    accept(visitor) {
        return visitor.visitTriangle(this)
    }
}

class CompoundShape implements ElementShape {
    private _shapes: ElementShape[] = []
    get shapes() {
        return this._shapes
    }
    add(shape: ElementShape): void {
        this._shapes.push(shape)
    }

    accept(visitor: ShapeVisitor): void {
        return visitor.visitCompoundShape(this)
    }
}

// Usage
const circle = new Circle(5)
const square = new Square(4)
const triangle = new Triangle(3, 4, 5)

const areaCalculator = new AreaCalculator()
const perimeterCalculator = new PerimeterCalculator()

const circleArea = circle.accept(areaCalculator)
const circlePerimeter = circle.accept(perimeterCalculator)
const squareArea = square.accept(areaCalculator)
const squarePerimeter = square.accept(perimeterCalculator)
const triangleArea = triangle.accept(areaCalculator)
const trianglePerimeter = triangle.accept(perimeterCalculator)

console.log(`Circle Area: ${circleArea}`)
console.log(`Circle Perimeter: ${circlePerimeter}`)
console.log(`Square Area: ${squareArea}`)
console.log(`Square Perimeter: ${squarePerimeter}`)
console.log(`Triangle Area: ${triangleArea}`)
console.log(`Triangle Perimeter: ${trianglePerimeter}`)

console.log('--------')

const compoundShape: CompoundShape = new CompoundShape()
compoundShape.add(square)
compoundShape.add(triangle)

const compoundShapeSecond: CompoundShape = new CompoundShape()
compoundShapeSecond.add(circle)

compoundShape.add(compoundShapeSecond)

const resultArea = compoundShape.accept(areaCalculator)
console.log(`CompoundShape Area result: ${resultArea}`)

console.log('--------')
const resultPerimeter = compoundShape.accept(perimeterCalculator)
console.log(`CompoundShape Perimeter result: ${resultPerimeter}`)