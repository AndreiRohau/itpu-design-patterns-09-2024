import {IData} from "./IData"
import {Observable} from "./Observable"
import {IService} from "./IService"

export class ConsoleView implements Observable {
    service: IService

    constructor(service: IService) {
      this.service = service;
      service.subscribe(this)
    }

    update() {
        // get updated model
        const data = this.service.getData()
        // update view (show new data)
        this.printSomeData(data)
    }

    printSomeData(data: IData) {
        console.log("Viewer Printing data: ")
        console.log(data)
        console.log("End of printing")
    }
}