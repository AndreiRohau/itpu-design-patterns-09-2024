import {ServiceFacade} from "./ServiceFacade"
import {IData} from "./IData"
import {IAnotherData} from "./IAnotherData"

export class Controller {
    serviceFacade: ServiceFacade

    constructor(serviceFacade: ServiceFacade) {
        this.serviceFacade = serviceFacade;
    }

    get() {
        return this.serviceFacade.getAllData()
    }

    set(iData: IData, iAnotherData: IAnotherData) {
        this.serviceFacade.setAllData(iData, iAnotherData)
    }
}