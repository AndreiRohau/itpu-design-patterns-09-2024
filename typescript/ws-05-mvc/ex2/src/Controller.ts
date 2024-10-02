import {IService} from "./IService"
import {IData} from "./IData"

export class Controller {
    service: IService

    constructor(service: IService) {
        this.service = service;
    }

    get() {
        return this.service.getData()
    }

    set(iData: IData) {
        this.service.setData(iData)
    }
}