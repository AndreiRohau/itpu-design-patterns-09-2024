package ioc.type.lookup;

public class Controller {
    private Service service;

    public Controller() {
    }

    public void doIt() {
        getService().runIt();
    }

    private Service getService() {
        return LookupService.getService();
    }
}
