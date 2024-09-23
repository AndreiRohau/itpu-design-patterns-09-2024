package di.dependency.field;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class IoC {
    private static Map<String, Object> beansMap = new HashMap<>();

    public static void initBeans() {
        System.out.println("Initializing beans");
        // detecting hierarchy of dependencies according to IoC instructions: xml, annotation...
        // ...

        // Service doesnot have dependencies
        Service service = new Service();
        beansMap.put(service.getClass().getSimpleName(), service);
        // ...

        // Controller has dependency on Service.class
        Controller controller = new Controller();
        // use Reflection API to set dependencies
        try {
            Field nameField = controller.getClass().getDeclaredField("service");
            nameField.setAccessible(true);  // Turn off access checks
            nameField.set(controller, beansMap.get(Service.class.getSimpleName()));
            nameField.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        beansMap.put(controller.getClass().getSimpleName(), controller);
        // ...
    }

    public static Object getBeanByName(String beanName) {
        return beansMap.get(beanName);
    }

    public static Object getBeanByClass(Class beanClass) {
        return beansMap.get(beanClass.getSimpleName());
    }
}
