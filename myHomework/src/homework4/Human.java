package homework4;

public class Human implements RunAndJump {
    protected int runLimit;
    protected int jumpLimit;

    public Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public int run(Obstacle obstacle) {
        int x = 0;
        if (obstacle instanceof Track) {
            if (this.runLimit >= obstacle.sizeOfObstacle) {
                System.out.println("Человек успешно пробежал");
            } else {
                System.out.println("Человек не смог пробежать");
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
                System.out.println("Человек успешно перепрыгнул");
            } else {
                System.out.println("Человек не смог перепрыгнуть");
                x = -1;
            }
        }
        return x;
    }
}
