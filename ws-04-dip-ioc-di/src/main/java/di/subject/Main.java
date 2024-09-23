package di.subject;

public class Main {
    public static void main(String[] args) {
        Subject math = new Maths();
        Subject eng = new English();
        // Still need to use DI framework to Inject automatically
        Target target = new Target(eng);
        System.out.println();
        System.out.println();
    }
}
