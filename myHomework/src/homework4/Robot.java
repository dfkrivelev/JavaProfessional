package homework4;

public class Robot implements CanRunAndJump{
    private int runLimit;
    private int jumpLimit;

    public Robot(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run(Obstacle sizeOfObstacle) {

    }

    @Override
    public void jump(Obstacle sizeOfObstacle) {

    }
}
