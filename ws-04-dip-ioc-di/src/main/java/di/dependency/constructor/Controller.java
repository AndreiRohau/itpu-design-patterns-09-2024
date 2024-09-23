package di.dependency.constructor;

public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void doIt() {
        service.runIt();
    }
}
