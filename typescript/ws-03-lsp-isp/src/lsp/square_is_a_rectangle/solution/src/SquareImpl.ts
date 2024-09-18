import {Square} from './Square'

export class SquareImpl implements Square {
    side: number
    private _side: number

    constructor(side: number) {
        this.side = side
        this._side = side
    }

    public setSide(side: number) {
        this._side = side
    }

    public getArea() {
        return this._side * this._side
    }
}
