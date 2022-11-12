package homework4;

public class Cat implements RunAndJump{
     protected int runLimit;
     protected int jumpLimit;

    public Cat(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run(Obstacle obstacle) {
       if(obstacle instanceof Track){
           if(this.runLimit >= obstacle.sizeOfObstacle){
               System.out.println("Кот успешно пробежал");
           }else{
               System.out.println("Кот не смог пробежать");
           }
       }
    }

    @Override
    public void jump(Obstacle obstacle) {
        if(obstacle instanceof Wall){
            if(this.jumpLimit >= obstacle.sizeOfObstacle){
                System.out.println("Кот успешно перепрыгнул");
            }else{
                System.out.println("Кот не смог перепрыгнуть");
            }
        }
    }
}
