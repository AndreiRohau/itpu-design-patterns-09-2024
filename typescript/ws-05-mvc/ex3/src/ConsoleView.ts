import {Observable} from "./Observable"
import {IData} from "./IData"
import {IAnotherData} from "./IAnotherData"
import {ServiceFacade} from "./ServiceFacade"

export class ConsoleView implements Observable {
    serviceFacade: ServiceFacade

    constructor(serviceFacade: ServiceFacade) {
      this.serviceFacade = serviceFacade;
      serviceFacade.subscribe(this)
    }

    update() {
        // get updated model
        const allData = this.serviceFacade.getAllData()
        // update view (show new data)
        this.printAllData(allData)
    }

    printAllData(allData: Object[]) {
        console.log("Viewer Printing allData: ")
        console.log(allData)
        console.log("End of printing")
    }
}