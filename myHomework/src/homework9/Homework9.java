package homework9;

import java.util.Iterator;

/**
 * Java Prof. Homework #9
 *
 * @author Dzmitry Kryvialeu
 * @version 28.11 - 30.11
 */

public class Homework9 {
    public static void main(String[] args) {
        ItrRubberList<Integer> list = new ItrRubberList<>();
        list.add(8);
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(7);

        for (Integer iterator : list) {
            System.out.print(iterator + " ");
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value > 7) {
                iterator.remove();
            }
        }
        System.out.println(list);

        ItrRubberList<Integer> stack = new ItrRubberList<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i * 5);
            System.out.println(stack);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }

        ItrRubberList<Integer> queue = new ItrRubberList<>();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i * 5);
            System.out.println(queue);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(queue.dequeue());
        }
    }
}
