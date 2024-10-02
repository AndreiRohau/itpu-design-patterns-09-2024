// usage.ts
import {Controller} from "./Controller";
import {IService} from "./IService";
import {IServiceImpl} from "./IServiceImpl";
import {ConsoleView} from "./ConsoleView";
import {IDataImpl} from "./IDataImpl";

// using Observer pattern
var iService: IService = new IServiceImpl()
var consoleView: ConsoleView = new ConsoleView(iService)
const controller = new Controller(iService);

// checking that we have default data
console.log("----controller1.get----start")
var data = controller.get();
console.log(data)
console.log("----controller1.get----end")

// running process: asking controller to update model; then model notifies subscribers
console.log("----controller1.set----start")
controller.set(new IDataImpl(1, "Design Patterns", "des_patt@it.pu"));
console.log("----controller1.set----end")

iService.unsubscribe(consoleView)
