package di.dependency.constructor;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Controller controller = new Controller(service);
        controller.doIt();
        System.out.println("Easy to test");
    }
}
