package homework6.fruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public void add(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        int totalNumber = 0;
        float totalWeight = 0;
        for (Fruit boxes : this.box) {
            totalNumber += boxes.numberOfFruits;
            totalWeight = totalNumber * boxes.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<T> box1, Box<T> box2) {
        return box1.getWeight() == box2.getWeight();
    }

    public Box<T> shift(Box<T> box, Box<T> emptyBox) {
        ArrayList<T> newBox = new ArrayList<>();
        for (T boxes : box.box) {
            emptyBox.add(boxes);
        }
        this.box = newBox;
        return emptyBox;
    }
}
