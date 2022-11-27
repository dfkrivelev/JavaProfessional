package homework8;

/**
 * Java Prof. Homework #8
 *
 * @author Dzmitry Kryvialeu
 * @version 24.11 - 27.11
 */

public class Homework8 {
    public static void main(String[] args) {
        RubberList<Integer> list = new RubberList<>();
        list.add(8);
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(7);
        System.out.println(list);

        list.remove(8);
        System.out.println(list + " " + list.size());

        list.remove(7);
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        list.remove(10);
        System.out.println(list);

        list.remove(3);
        System.out.println(list + " " + list.size());
    }
}
