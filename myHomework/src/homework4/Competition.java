package homework4;
/**
 * Java Prof. Homework #4
 *
 * @author Dzmitry Kryvialeu
 * @version 10.11 - 12.11
 */

public class Competition {
    public static void main(String[] args) {
        RunAndJump cat = new Cat(280, 3);
        RunAndJump robot = new Robot(300, 2);
        RunAndJump human = new Human(250, 1);

        RunAndJump[] players = {cat, robot, human};
        Obstacle[] obstacles = {new Track(270), new Wall(3), new Track(250)};

        for (RunAndJump play : players) {
            for (Obstacle obstacle : obstacles) {
                if (play.run(obstacle) == 0) {
                    if (play.jump(obstacle) == -1) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
