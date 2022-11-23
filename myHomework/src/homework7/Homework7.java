package homework7;

import java.util.Iterator;

/**
 * Java Prof. Homework #7
 *
 * @author Dzmitry Kryvialeu
 * @version 21.11 - 23.11
 */

public class Homework7 {
    public static void main(String[] args) {
        ItrRubberArray<Integer> newArray = new ItrRubberArray<>();
        newArray.addAll(10, 5, 8, 6);
        Iterator<Integer> iterator = newArray.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
