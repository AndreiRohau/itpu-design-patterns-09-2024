import {CourseService} from "./CourseService"

export class CourseController {
    courseService: CourseService

    constructor(courseService: CourseService) {
       this.courseService = courseService;
    }

    async get() {
     // ...
       const data = await this.courseService.getCourses()
     // ...
     console.log(data)
    }
}