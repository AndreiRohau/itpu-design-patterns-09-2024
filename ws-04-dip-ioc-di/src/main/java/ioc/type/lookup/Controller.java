package ioc.type.lookup;

public class Controller {
    private Service service;

    public void initDependencies() {
        this.service = LookupService.getService();
    }

    public void doIt() {
        service.runIt();
    }
}
