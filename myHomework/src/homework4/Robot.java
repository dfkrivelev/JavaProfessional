package homework4;

public class Robot implements RunAndJump {
    protected int runLimit;
    protected int jumpLimit;

    public Robot(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public int run(Obstacle obstacle) {
        int x = 0;
        if (obstacle instanceof Track) {
            if (this.runLimit >= obstacle.sizeOfObstacle) {
                System.out.println("Робот успешно пробежал");
            } else {
                System.out.println("Робот не смог пробежать");
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
                System.out.println("Робот успешно перепрыгнул");
            } else {
                System.out.println("Робот не смог перепрыгнуть");
                x = -1;
            }
        }
        return x;
    }
}
