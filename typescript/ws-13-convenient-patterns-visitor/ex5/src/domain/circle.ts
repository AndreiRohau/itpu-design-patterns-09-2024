import { ElementShape } from '../elementShape'
import { ShapeVisitor } from '../shapeVisitor'

export class Circle implements ElementShape {
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