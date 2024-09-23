import {ICourseService} from "./ICourseService"
import {ICourse} from "./ICourse"
import {ICourseImpl} from "./ICourseImpl"

export class ICourseServiceImpl implements ICourseService {
  getCourses(): Promise<ICourse> {
    return new Promise((resolve, reject) => {
        var course: ICourse = new ICourseImpl(1, "Design P", "smt@email.ty")
        resolve(course);
        });
  }
}
