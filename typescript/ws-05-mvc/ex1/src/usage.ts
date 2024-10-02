// usage.ts
import {Controller} from "./Controller";
import {IServiceImpl} from "./IServiceImpl";
import {ConsoleView} from "./ConsoleView";

// using IServiceImpl
console.log(" : ")
console.log("IServiceImpl: ")

const controller1 = new Controller(new IServiceImpl(), new ConsoleView());

controller1.get();
