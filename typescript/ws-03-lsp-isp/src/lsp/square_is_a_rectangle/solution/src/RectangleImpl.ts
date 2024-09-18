import {Rectangle} from './Rectangle'

export class RectangleImpl implements Rectangle {
    width: number
    length: number

    private _width: number
    private _length: number

    constructor(width: number, length: number) {
        this.width = width
        this.length = length
        this._width = width
        this._length = length
    }

    public setWidth(width: number) {
        this._width = width
    }

    public setLength(length: number) {
        this._length = length
    }

    public getArea() {
        return this._width * this._length
    }
}