import { ShapeVisitor } from './shapeVisitor'

// Visitable Elements
export interface ElementShape {
    accept(visitor: ShapeVisitor): number
}
