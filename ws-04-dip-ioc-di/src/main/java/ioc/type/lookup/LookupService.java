package ioc.type.lookup;

public class LookupService {
    private static final Service service = new Service();
    private static final Controller controller = new Controller();

    public static Service getService() {
        return service;
    }

    public static Controller getController() {
        return controller;
    }
}
