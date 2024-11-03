import {IService} from "./IService"
import {IData} from "./IData"
import {IDataImpl} from "./IDataImpl"
import {Observable} from "./Observable"

// decorator for IServiceImpl
export class IServiceImplExtended implements IService {
    original: IServiceImpl

    observers: Observable[]

    constructor(original: IServiceImpl) {
        this.original = original
        // init default data in storage
        this.iData = new IDataImpl(0, "Default Data", "Default@email.de")
        this.observers = []
    }

    getData(): IData {
        var original_data = this.original.getData()
        // validate original_data
        // change\decorate original_data
        original_data.name = original_data.name + "_ext"
        return original_data
    }

    // update model \ process data \ save \ update \ delete \ etc.
    setData(iData: IData) {
        // validate it iData
        original.setData(iData)
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
