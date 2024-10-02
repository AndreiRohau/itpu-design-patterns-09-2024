import {IAnotherData} from "./IAnotherData"
import {Observable} from "./Observable"

export interface IAnotherService {
    // business logic
    getAnotherData(): IAnotherData
    setAnotherData(iAnotherData: IAnotherData): void
}