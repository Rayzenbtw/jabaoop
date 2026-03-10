package prac.practice7;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Class<?> c1 = String.class;                 // через .class
        Class<?> c2 = "hello".getClass();           // через об'єкт
        Class<?> c3 = Class.forName("java.lang.String"); // через ім'я класу

        System.out.println("a) Three Class objects:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\nb) Modifiers of String:");
        int modifiers = c1.getModifiers();
        System.out.println(Modifier.toString(modifiers));

        // Public конструктори
        System.out.println("\nc) Public constructors:");
        Constructor<?>[] constructors = c1.getConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        //Всі поля класу
        System.out.println("\nd) All declared fields:");
        Field[] fields = c1.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
        }

        //Всі public метод
        System.out.println("\ne) Public methods:");
        Method[] methods = c1.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

        String str = "reflection";

        // беремо метод substring(int, int)
        Method substringMethod = c1.getMethod("substring", int.class, int.class);

        Object result = substringMethod.invoke(str, 0, 4);

        System.out.println("Result of substring(0,4): " + result);
    }
}
