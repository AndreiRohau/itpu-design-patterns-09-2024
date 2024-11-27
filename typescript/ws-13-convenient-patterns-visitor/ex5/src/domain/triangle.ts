import { ElementShape } from '../elementShape'
import { ShapeVisitor } from '../shapeVisitor'

export class Triangle implements ElementShape {
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