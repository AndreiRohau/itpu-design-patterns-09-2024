import { Circle } from '../domain/circle'
import { CompoundShape } from '../domain/compoundShape'
import { ShapeVisitor } from '../shapeVisitor'
import { Square } from '../domain/square'
import { Triangle } from '../domain/triangle'

// Concrete Visitor
export class PerimeterCalculatorShapeVisitor extends ShapeVisitor {
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