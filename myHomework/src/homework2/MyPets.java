package homework2;

/**
 * Java Prof. Homework #2
 *
 * @author Dzmitry Kryvialeu
 * @version 03.11 - 05.11
 */
public class MyPets {
    public static void main(String[] args) {
        Cat cat = new Cat("Elon", "Black", 7, 0.3);
        Dog dog = new Dog("Musk", "Red", 10, 0.5);
        Parrot parrot = new Parrot("Eagle", "Blue", 3, 0.25);

        cat.voice();
        dog.voice();
        parrot.voice();

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(parrot);

        System.out.println(sum(cat.age, dog.age, parrot.age));
        System.out.println(sum(cat.name, dog.name));
        System.out.println(sum(cat.growth, dog.growth, parrot.growth));
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static String sum(String x, String y) {
        return x + " " + y;
    }

    static double sum(double x, double y, double z) {
        return x + y + z;
    }
}
