package di.dependency.setter;

public class Controller {
    private Service service;

    public Controller() {
    }

    public void doIt() {
        service.runIt();
    }

    public void setService(Service service) {
        this.service = service;
    }
}
