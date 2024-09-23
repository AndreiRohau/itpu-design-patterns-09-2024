package di.dependency.bad;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.doIt();
        System.out.println("Hard to test");
    }
}
