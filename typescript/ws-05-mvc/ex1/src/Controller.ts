import {IService} from "./IService"
import {ConsoleView} from "./ConsoleView"

export class Controller {
    service: IService
    view: ConsoleView

    constructor(service: IService, view: ConsoleView) {
      this.service = service;
      this.view = view;
    }

    async get() {
        // ...
        const data = await this.service.getData()
        // ...
        this.view.printSomeData(data)
    }
}