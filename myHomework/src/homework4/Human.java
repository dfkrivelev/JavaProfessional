package homework4;

public class Human implements RunAndJump{
    protected int runLimit;
    protected int jumpLimit;

    public Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run(Obstacle obstacle) {
        if(obstacle instanceof Track){
            if(this.runLimit >= obstacle.sizeOfObstacle){
                System.out.println("Человек успешно пробежал");
            }else{
                System.out.println("Человек не смог пробежать");
            }
        }
    }

    @Override
    public void jump(Obstacle obstacle) {
        if(obstacle instanceof Wall){
            if(this.jumpLimit >= obstacle.sizeOfObstacle){
                System.out.println("Человек успешно перепрыгнул");
            }else{
                System.out.println("Человек не смог перепрыгнуть");
            }
        }
    }
}
