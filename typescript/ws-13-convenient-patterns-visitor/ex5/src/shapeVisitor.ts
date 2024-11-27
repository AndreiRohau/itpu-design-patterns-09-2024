import { Circle } from './domain/circle'
import { CompoundShape } from './domain/compoundShape'
import { Square } from './domain/square'
import { Triangle } from './domain/triangle'

// Visitor Interface / abstract class with a default logic
export class ShapeVisitor {
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
