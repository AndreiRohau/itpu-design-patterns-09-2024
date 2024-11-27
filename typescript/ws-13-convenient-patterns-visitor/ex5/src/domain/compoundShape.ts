import { ElementShape } from '../elementShape'
import { ShapeVisitor } from '../shapeVisitor'

export class CompoundShape implements ElementShape {
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