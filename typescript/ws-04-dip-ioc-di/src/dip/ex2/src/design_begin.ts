// DESIGN
// class CourseService {
//       getCourses() {
//             return new Promise((resolve, reject) => {
//                            const course = {
//                                id: 1,
//                                name: 'Design patterns',
//                                email: 'john@example.com'
//                            };
//                            resolve(course);
//                        });
//       }
// }
//
// class CourseController {
//       constructor(courseService: CourseService) {
//             this.courseService = courseService;
//       }
//
//       async get() {
//           // ...
//             const data = await courseService.getCourses()
//           // ...
//           console.log(data)
//       }
// }