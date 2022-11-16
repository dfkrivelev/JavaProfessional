package homework5;

/**
 * Java Prof. Homework #5
 *
 * @author Dzmitry Kryvialeu
 * @version 14.11 - 16.11
 */

public class Homework5 {
    public static void main(String[] args) {
        RubberArray rubberArray = new RubberArray();

        rubberArray.add(5);
        rubberArray.addAll(10, 6, 7);
        System.out.println(rubberArray);

        System.out.println(rubberArray.size());
        System.out.println(rubberArray.get(2));

        rubberArray.set(3, 8);
        System.out.println(rubberArray);

        System.out.println(rubberArray.remove(Integer.valueOf(10)));
        System.out.println(rubberArray);

        rubberArray.remove(0);
        System.out.println(rubberArray);

        System.out.println(rubberArray.contains(6));
        int[] array = rubberArray.toArray();
    }
}
