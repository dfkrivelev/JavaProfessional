package Lesson31;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Lesson31 {
    public static void main(String[] args) {
        //get class obj #1
        String s = "Java";
        Class stringClass = s.getClass();

        //get class object
        Class strClass = String.class;
        Class intClass = int.class;
        Class voidClass = void.class;

        //output
        System.out.println(stringClass.getName());
        System.out.println(stringClass.getSimpleName());
        System.out.println(intClass.getName());
        System.out.println(voidClass.getName());

        Class catClass = Cat.class;
        System.out.println(catClass.getName());
        System.out.println("SuperClass: " + catClass.getSuperclass().getName());
        int m = catClass.getModifiers();
        if (Modifier.isPublic(m)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(m)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(m)) {
            System.out.println("final");
        }

        System.out.println("Fields: ");
        Field[] fields = catClass.getFields();
        for (Field f : fields) {
            System.out.println(f.getName() + " " + f.getType());
        }

        fields = catClass.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName() + " " + f.getType());
        }
    }
}
