class XboxStockConcreteSubject implements Subject {
    private readonly observers: Observer[]
    private _quantityInStock: number
    constructor() { }
    get quantityInStock(){
        return this._quantityInStock
    }
    set quantityInStock(value){
        this._quantityInStock = value
        if(value > 0) this.notifyAll()
    }
    addObserver(observer: Observer): void {
        this.observers.push(observer);
    }
    removeObserver(observer: Observer): void {
        const index = this.observers.indexOf(observer);
        if (index > -1) {
            this.observers.splice(index, 1);
        }
    }
    notifyAll(): void {
        for (let observer of this.observers) {
            observer.update(this.quantityInStock)
        }
    }
}