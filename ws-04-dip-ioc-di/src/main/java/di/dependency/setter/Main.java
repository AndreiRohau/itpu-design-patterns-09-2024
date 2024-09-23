package di.dependency.setter;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Controller controller = new Controller();
        controller.setService(service);

        controller.doIt();
        System.out.println("Easy to test");
    }
}
