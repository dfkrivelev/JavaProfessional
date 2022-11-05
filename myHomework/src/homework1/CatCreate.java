package homework1;

/**
 * Java Prof. Homework #1
 *
 * @author Dzmitry Kryvialeu
 * @version 31.10 - 03.11
 */
public class CatCreate {
    public static void main(String[] args) {
        Cat cat = new Cat("Morty", "Black", 10);
        cat.voice();
        System.out.println(cat);
    }
}