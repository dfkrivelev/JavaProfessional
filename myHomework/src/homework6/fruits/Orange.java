package homework6.fruits;

public class Orange extends Fruit {
    protected float weightOfOranges = 1.5f;

    public Orange(int numberOfOranges) {
        super(numberOfOranges);
    }

    @Override
    public float getWeight() {
        return this.weightOfOranges;
    }
}
