package homework4;

public class Competition {
    public static void main(String[] args) {
        RunAndJump cat = new Cat(280, 3);
        RunAndJump robot = new Robot(300, 2);
        RunAndJump human = new Human(250, 1);

        Obstacle track = new Track(270);
        Obstacle wall = new Wall(3);

        RunAndJump[] players = {cat, robot, human};
        Obstacle[] obstacles = {track, wall};

        for(RunAndJump play : players){
            for(Obstacle obstacle : obstacles){
                play.run(obstacle);
                play.jump(obstacle);
            }
        }

    }
}
