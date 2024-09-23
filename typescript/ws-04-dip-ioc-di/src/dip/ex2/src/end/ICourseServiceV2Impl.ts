import {ICourseService} from "./ICourseService"
import {ICourse} from "./ICourse"
import {ICourseImpl} from "./ICourseImpl"

export class ICourseServiceV2Impl implements ICourseService {
  getCourses(): Promise<ICourse> {
    return new Promise((resolve, reject) => {
        var course: ICourse = new ICourseImpl(2, "Design Patterns", "something@itpu.com")
        resolve(course);
        });
  }
}
