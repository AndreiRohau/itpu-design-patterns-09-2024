import {Circle} from './Circle'

export class CircleImpl implements Circle {
    radius: number
    private _radius: number

    constructor(radius: number) {
        this.radius = radius
        this._radius = radius
    }

    public setRadius(radius: number) {
        this._radius = radius
    }

    public getArea() {
        return this._radius * 3.14 * this._radius
    }
}
