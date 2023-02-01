package homework22;

/**
 * Java Prof. Homework #22
 *
 * @author Dzmitry Kryvialeu
 * @version 30.01 - 01.02
 */

import java.util.Arrays;

public class Homework22 {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] array = new float[size];
        Arrays.fill(array, 1.0f);

        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.printf("Время для первого метода: %d\n", System.currentTimeMillis() - start);
    }

    public static void secondMethod() {
        int size = 10_000_000;
        float[] array = new float[size];
        Arrays.fill(array, 1.0f);

        long start = System.currentTimeMillis();
        float[] one = Arrays.copyOfRange(array, 0, (size + 1) / 2);
        float[] two = Arrays.copyOfRange(array, (size + 1) / 2, size);

        new Homework22().thread(one).start();
        new Homework22().thread(two).start();

        float[] result = Arrays.copyOf(one, one.length + two.length);
        System.arraycopy(two, 0, result, one.length, two.length);

        System.out.printf("Время второго метода с нитями: %d\n", System.currentTimeMillis() - start);
    }

    public Thread thread(float[] array) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < array.length; i++) {
                array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        return thread;
    }
}
