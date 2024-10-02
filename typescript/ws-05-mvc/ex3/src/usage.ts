// usage.ts
import {Controller} from "./Controller";
import {ConsoleView} from "./ConsoleView";
import {ServiceFacade} from "./ServiceFacade";
import {IService} from "./IService";
import {IAnotherService} from "./IAnotherService";
import {IServiceImpl} from "./IServiceImpl";
import {IAnotherServiceImpl} from "./IAnotherServiceImpl";
import {IDataImpl} from "./IDataImpl";
import {IAnotherDataImpl} from "./IAnotherDataImpl";

// using Observer pattern
var iService: IService = new IServiceImpl()
var iAnotherService: IAnotherService = new IAnotherServiceImpl()
var serviceFacade: ServiceFacade = new ServiceFacade(iService, iAnotherService)
var consoleView: ConsoleView = new ConsoleView(serviceFacade)
const controller = new Controller(serviceFacade);

// checking that we have default data
console.log("----controller1.get----start")
var data = controller.get();
console.log(data)
console.log("----controller1.get----end")

// running process: asking controller to update model; then model notifies subscribers
console.log("----controller1.set----start")
controller.set(new IDataImpl(1, "Design Patterns", "des_patt@it.pu"), new IAnotherDataImpl(1, "New ADDRESS!!!!"));
console.log("----controller1.set----end")

serviceFacade.unsubscribe(consoleView)
