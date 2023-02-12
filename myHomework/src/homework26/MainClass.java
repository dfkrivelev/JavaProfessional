package homework26;

/**
 * Java Prof. Homework #26
 *
 * @author Dzmitry Kryvialeu
 * @version 09.02 - 12.02
 */

public class MainClass {
    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(80), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        Thread[] threads = new Thread[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            threads[i] = new Thread(cars[i]);
            threads[i].start();
        }

        try {
            for (int i = 0; i < threads.length; i++) {
                threads[i].join();
            }
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
