package ioc.type.lookup;

public class Main {
    public static void main(String[] args) {
        Service service = LookupService.getService();

        Controller controller = new Controller();
        controller.initDependencies();

        controller.doIt();
        System.out.println("Easy to test");
    }
}
