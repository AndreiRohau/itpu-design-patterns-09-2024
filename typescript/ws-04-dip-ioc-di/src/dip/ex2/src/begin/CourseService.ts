export class CourseService {
     getCourses() {
           return new Promise((resolve, reject) => {
                          const course = {
                              id: 1,
                              name: 'Design patterns',
                              email: 'john@example.com'
                          };
                          resolve(course);
                      });
     }
}