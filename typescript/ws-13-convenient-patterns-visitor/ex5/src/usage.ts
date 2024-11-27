console.log("works")

import { AreaCalculatorShapeVisitor } from './visitor/areaCalculatorShapeVisitor'
import { Circle } from './domain/circle'
import { CompoundShape } from './domain/compoundShape'
import { PerimeterCalculatorShapeVisitor } from './visitor/perimeterCalculatorShapeVisitor'
import { Square } from './domain/square'
import { Triangle } from './domain/triangle'

// Usage
const circle = new Circle(5)
const square = new Square(4)
const triangle = new Triangle(3, 4, 5)

const areaCalculator = new AreaCalculatorShapeVisitor()
const perimeterCalculator = new PerimeterCalculatorShapeVisitor()

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