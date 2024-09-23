package di.dependency.field;

public class Main {
    public static void main(String[] args) {
        IoC.initBeans();
        Service service = (Service) IoC.getBeanByClass(Service.class);
        Controller controller = (Controller) IoC.getBeanByClass(Controller.class);
        controller.doIt();
        System.out.println("Easy to test");
    }
}
