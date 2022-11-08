package homework3;

public class Dog extends Animal {
    public Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    @Override
    public void run(int distanceRun) {
        if (this.runLimit > distanceRun) {
            System.out.printf("Собака пробежала %d метров\n", distanceRun);
        } else {
            System.out.printf("Собака не может пробежать %d метров\n", distanceRun);
        }
    }

    @Override
    public void swim(int distanceSwim) {
        if (this.swimLimit > distanceSwim) {
            System.out.printf("Собака проплыла %d метров\n", distanceSwim);
        } else {
            System.out.printf("Собака не может проплыть %d метров\n", distanceSwim);
        }
    }
}
