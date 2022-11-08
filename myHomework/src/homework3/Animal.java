package homework3;

public abstract class Animal implements CanFlyAndSwim {
    protected int runLimit;
    protected int swimLimit;
    protected static int numberOfCats;
    protected static int numberOfDogs;

    public Animal(int runLimit, int swimLimit) {
        numberOfDogs++;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public Animal(int runLimit) {
        numberOfCats++;
        this.runLimit = runLimit;
    }
}
