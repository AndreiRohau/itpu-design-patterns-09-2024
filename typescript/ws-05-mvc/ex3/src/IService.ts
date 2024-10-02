import {IData} from "./IData"
import {Observable} from "./Observable"

export interface IService {
    // business logic
    getData(): IData
    setData(iData: IData): void
}