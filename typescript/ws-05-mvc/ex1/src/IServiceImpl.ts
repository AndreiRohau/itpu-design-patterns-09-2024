import {IService} from "./IService"
import {IData} from "./IData"
import {IDataImpl} from "./IDataImpl"

export class IServiceImpl implements IService {
  getData(): Promise<IData> {
    return new Promise((resolve, reject) => {
        var course: IData = new IDataImpl(1, "Design P", "smt@email.ty")
        resolve(course);
        });
  }
}
