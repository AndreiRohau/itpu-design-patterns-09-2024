import { ElementShape } from '../elementShape'
import { ShapeVisitor } from '../shapeVisitor'

export class Square implements ElementShape {
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