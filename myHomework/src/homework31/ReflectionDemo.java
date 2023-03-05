package homework31;

/**
 * Java Prof. Homework #31
 *
 * @author Dzmitry Kryvialeu
 * @version 02.03 - 05.03
 */

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Dog", 5);
        System.out.println(cat);

        try {
            Field field = cat.getClass().getDeclaredField("a");
            field.setAccessible(true);
            field.set(cat, 8);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cat);

        //вызов метода voice() объекта Cat с помощью рефлексии
        try {
            Method voice = Cat.class.getDeclaredMethod("voice");
            voice.invoke(cat);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // TODO домашнее задание
        Method[] methods = Cat.class.getDeclaredMethods();
        for (Method m : methods) {
            if (m.getAnnotation(MarkingAnnotation.class) != null) {
                System.out.println("Метод помечен");
            }
        }
    }
}
