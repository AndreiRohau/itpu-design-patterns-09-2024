import {ICourse} from "./ICourse"

export interface ICourseService {
  getCourses(): Promise<ICourse>
}