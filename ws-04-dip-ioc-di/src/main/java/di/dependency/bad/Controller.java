package di.dependency.bad;

public class Controller {
    private Service service;

    // NEVER INIT dependencies in dependant Classes
    // hard to test
    // hard to reuse
    // high cohesion
    // breaks single responsibility (this point can be argued though)
    public Controller() {
        this.service = new Service();
    }

    public void doIt() {
        service.runIt();
    }
}
