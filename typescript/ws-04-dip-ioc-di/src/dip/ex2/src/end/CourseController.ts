import {ICourseService} from "./ICourseService"

export class CourseController {
    courseService: ICourseService

    constructor(courseService: ICourseService) {
      this.courseService = courseService;
    }

    async get() {
        // ...
        const data = await this.courseService.getCourses()
        // ...
        console.log(data);
    }
}