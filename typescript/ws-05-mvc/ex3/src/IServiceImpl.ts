import {IService} from "./IService"
import {IData} from "./IData"
import {IDataImpl} from "./IDataImpl"

export class IServiceImpl implements IService {
    iData: IData // this is some storage

    constructor() {
        // init default data in storage
        this.iData = new IDataImpl(0, "Default Data", "Default@email.de")
    }

    getData(): IData {
        // get data from storage
        return this.iData
    }

    // update model \ process data \ save \ update \ delete \ etc.
    setData(iData: IData) {
        // process data
        this.iData = iData
    }
}
