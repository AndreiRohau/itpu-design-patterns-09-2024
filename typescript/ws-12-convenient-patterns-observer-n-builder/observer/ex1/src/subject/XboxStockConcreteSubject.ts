import {Subject} from '../Subject'
import {Observer} from '../Observer'

export class XboxStockConcreteSubject implements Subject {
    private readonly observers: Observer[] = []
    private _quantityInStock: number = 0
    public constructor() { }
    public get quantityInStock() {
        return this._quantityInStock
    }
    public set quantityInStock(value) {
        this._quantityInStock = value
        if (value > 0) {
            this.notifyAll()
        }
    }
    public addObserver(observer: Observer): void {
        this.observers.push(observer)
    }
    public removeObserver(observer: Observer): void {
        const index = this.observers.indexOf(observer);
        if (index > -1) {
            this.observers.splice(index, 1)
        }
    }
    public notifyAll(): void {
        for (let observer of this.observers) {
            observer.update(this.quantityInStock)
        }
    }
}