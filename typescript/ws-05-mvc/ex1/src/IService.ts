import {IData} from "./IData"

export interface IService {
  getData(): Promise<IData>
}