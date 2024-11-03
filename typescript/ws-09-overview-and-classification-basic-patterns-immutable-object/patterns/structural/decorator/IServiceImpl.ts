import {IService} from "./IService"
import {IData} from "./IData"
import {IDataImpl} from "./IDataImpl"
import {Observable} from "./Observable"

export class IServiceImpl implements IService {
    iData: IData // this is some storage
    observers: Observable[]

    constructor() {
        // init default data in storage
        this.iData = new IDataImpl(0, "Default Data", "Default@email.de")
        this.observers = []
    }

    getData(): IData {
        // get data from storage
        return this.iData
    }

    // update model \ process data \ save \ update \ delete \ etc.
    setData(iData: IData) {
        // process data
        this.iData = iData
        // notify subscribers
        this.notify()
    }

    notify() {
        for (const observer of this.observers) {
            observer.update()
        }
    }
    subscribe(observer: Observable) {
        this.observers.push(observer)
    }
    unsubscribe(observer: Observable) {
        const index = this.observers.indexOf(observer);
        this.observers.splice(index, 1);
        console.log(observer, "is unsubscribed successfully.")
    }
}
