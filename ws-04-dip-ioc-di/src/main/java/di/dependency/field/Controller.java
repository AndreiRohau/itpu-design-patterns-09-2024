package di.dependency.field;

import javax.inject.Inject;

public class Controller {
    @Inject
    private Service service;

    public Controller() {
    }

    public void doIt() {
        service.runIt();
    }
}
