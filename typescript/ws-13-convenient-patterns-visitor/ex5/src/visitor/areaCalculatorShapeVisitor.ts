import { Circle } from '../domain/circle'
import { CompoundShape } from '../domain/compoundShape'
import { ShapeVisitor } from '../shapeVisitor'
import { Square } from '../domain/square'
import { Triangle } from '../domain/triangle'

// Concrete Visitor
export class AreaCalculatorShapeVisitor extends ShapeVisitor {
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