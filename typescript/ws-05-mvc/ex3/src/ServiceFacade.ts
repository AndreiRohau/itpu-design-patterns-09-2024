import {IService} from "./IService"
import {IAnotherService} from "./IAnotherService"
import {Observable} from "./Observable"
import {IData} from "./IData"
import {IAnotherData} from "./IAnotherData"

export class ServiceFacade {
    observers: Observable[]
    iService: IService
    iAnotherService: IAnotherService

    constructor(iService: IService, iAnotherService: IAnotherService) {
        this.iService = iService
        this.iAnotherService = iAnotherService
        this.observers = []
    }

    getAllData() {
        return [this.iService.getData(), this.iAnotherService.getAnotherData()]
    }

    setAllData(iData: IData, iAnotherData: IAnotherData) {
        this.iService.setData(iData)
        this.iAnotherService.setAnotherData(iAnotherData)
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