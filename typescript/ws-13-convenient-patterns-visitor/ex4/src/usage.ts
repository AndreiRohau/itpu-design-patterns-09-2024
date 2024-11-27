console.log("works")  

// Visitor Interface
class ShapeVisitor {
    public visitCircle(circle: Circle): number {
        return 0
    }
    public visitSquare(square: Square): number {
        return 0
    }
    public visitTriangle(triangle: Triangle): number {
        return 0
    }
    public visitCompoundShape(compoundShape: CompoundShape): number {
        return 0
    }
}

// Concrete Visitors
class AreaCalculator extends ShapeVisitor {
    public visitCircle(circle: Circle): number {
        console.log(`Visiting ${circle.constructor.name} with AreaCalculator`)
        return Math.PI * Math.pow(circle.radius, 2)
    }
    public visitSquare(square: Square): number {
        console.log(`Visiting ${square.constructor.name} with AreaCalculator`)
        return Math.pow(square.side, 2)
    }
    public visitTriangle(triangle: Triangle): number {
        console.log(`Visiting ${triangle.constructor.name} with AreaCalculator`)
        // Assuming Heron's formula for triangle area calculation
        const s = (triangle.sideA + triangle.sideB + triangle.sideC) / 2
        return Math.sqrt(s * (s - triangle.sideA) * (s - triangle.sideB) * (s - triangle.sideC))
    }
    public visitCompoundShape(compoundShape: CompoundShape): number {
        console.log(`Visiting ${compoundShape.constructor.name} with AreaCalculator`)
        let result = 0
        for (const shape of compoundShape.shapes) {
            result += shape.accept(this)
        }
        return result
    }
}

class PerimeterCalculator extends ShapeVisitor {
    public visitCircle(circle: Circle): number {
        console.log(`Visiting ${circle.constructor.name} with AreaCalculator`)
        return 2 * Math.PI * circle.radius
    }
    public visitSquare(square: Square): number {
        console.log(`Visiting ${square.constructor.name} with AreaCalculator`)
        return 4 * square.side
    }
    public visitTriangle(triangle: Triangle): number {
        console.log(`Visiting ${triangle.constructor.name} with AreaCalculator`)
        return triangle.sideA + triangle.sideB + triangle.sideC
    }
    public visitCompoundShape(compoundShape: CompoundShape): number {
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
    accept(visitor: ShapeVisitor): number
}

class Circle implements ElementShape {
    private _radius: number
    public constructor(radius: number) {
        this._radius = radius
    }
    public get radius(): number {
        return this._radius
    }

    public accept(visitor: ShapeVisitor): number {
        return visitor.visitCircle(this)
    }
}

class Square implements ElementShape {
    private _side: number
    public constructor(side: number) {
        this._side = side
    }
    public get side(): number {
        return this._side
    }

    public accept(visitor: ShapeVisitor): number {
        return visitor.visitSquare(this)
    }
}

class Triangle implements ElementShape {
    private _sideA: number
    private _sideB: number
    private _sideC: number
    public constructor(sideA: number, sideB: number, sideC: number) {
        this._sideA = sideA
        this._sideB = sideB
        this._sideC = sideC
    }
    public get sideA(): number {
        return this._sideA
    }
    public get sideB(): number {
        return this._sideB
    }
    public get sideC(): number {
        return this._sideC
    }

    public accept(visitor: ShapeVisitor): number {
        return visitor.visitTriangle(this)
    }
}

class CompoundShape implements ElementShape {
    private _shapes: ElementShape[] = []
    public get shapes(): ElementShape[] {
        return this._shapes
    }
    public add(shape: ElementShape): void {
        this._shapes.push(shape)
    }

    public accept(visitor: ShapeVisitor): number {
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