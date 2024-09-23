// usage.ts
import {CourseController} from "./end/CourseController";
import {ICourseServiceImpl} from "./end/ICourseServiceImpl";
import {ICourseServiceV2Impl} from "./end/ICourseServiceV2Impl";

// using ICourseServiceImpl
console.log(" : ")
console.log("ICourseServiceImpl: ")

const controller1 = new CourseController(new ICourseServiceImpl());

controller1.get();

// using ICourseServiceV2Impl
console.log(" : ")
console.log("ICourseServiceV2Impl: ")

const controller2 = new CourseController(new ICourseServiceV2Impl());

controller2.get();