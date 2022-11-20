package homework6.fruits;

/**
 * Java Prof. Homework #6
 *
 * @author Dzmitry Kryvialeu
 * @version 17.11 - 20.11
 */

public class Depot {
    public static <T extends Fruit> void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(15));
        appleBox.add(new Apple(5));

        System.out.println("Коробка с яблоками весит: " + appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(15));
        orangeBox.add(new Orange(5));

        System.out.println("Коробка с апельсинами весит: " + orangeBox.getWeight());

        Box<T> box = new Box<>();
        System.out.println(box.compare((Box<T>) appleBox, (Box<T>) orangeBox));

        Box<Apple> emptyAppleBox = new Box<>();
        appleBox.shift(appleBox, emptyAppleBox);
        System.out.println(emptyAppleBox.getWeight());
        System.out.println(appleBox.getWeight());
    }
}
