package homework6.fruits;

public class Apple extends Fruit {
    protected float weightOfApples = 1.0f;

    public Apple(int numberOfApples) {
        super(numberOfApples);
    }

    @Override
    public float getWeight() {
        return this.weightOfApples;
    }
}
