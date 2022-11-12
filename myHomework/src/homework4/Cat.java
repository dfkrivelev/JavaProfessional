package homework4;

public class Cat implements RunAndJump {
    protected int runLimit;
    protected int jumpLimit;

    public Cat(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public int run(Obstacle obstacle) {
        int x = 0;
        if (obstacle instanceof Track) {
            if (this.runLimit >= obstacle.sizeOfObstacle) {
                System.out.println("Кот успешно пробежал");
            } else {
                System.out.println("Кот не смог пробежать");
                x = 1;
            }
        }
        return x;
    }

    @Override
    public int jump(Obstacle obstacle) {
        int x = 0;
        if (obstacle instanceof Wall) {
            if (this.jumpLimit >= obstacle.sizeOfObstacle) {
                System.out.println("Кот успешно перепрыгнул");
            } else {
                System.out.println("Кот не смог перепрыгнуть");
                x = -1;
            }
        }
        return x;
    }
}
