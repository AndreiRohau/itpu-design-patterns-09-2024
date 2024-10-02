import {IAnotherService} from "./IAnotherService"
import {IAnotherData} from "./IAnotherData"
import {IAnotherDataImpl} from "./IAnotherDataImpl"

export class IAnotherServiceImpl implements IAnotherService {
    iAnotherData: IAnotherData // this is some storage

    constructor() {
        // init default data in storage
        this.iAnotherData = new IAnotherDataImpl(0, "Default AnotherData Address")
    }

    getAnotherData(): IAnotherData {
        // get Another data from storage
        return this.iAnotherData
    }

    // update model \ process data \ save \ update \ delete \ etc.
    setAnotherData(iAnotherData: IAnotherData) {
        // process data
        this.iAnotherData = iAnotherData
    }
}
