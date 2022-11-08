package homework3;

public class Cat extends Animal {
    public Cat(int runLimited) {
        super(runLimited);
    }

    @Override
    public void run(int distanceRun) {
        if (this.runLimit > distanceRun) {
            System.out.printf("Кот пробежал %d метров\n", distanceRun);
        } else {
            System.out.printf("Кот не может пробежать %d метров\n", distanceRun);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать =(");
    }
}
