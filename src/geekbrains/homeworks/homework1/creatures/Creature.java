package geekbrains.homeworks.homework1.creatures;

import geekbrains.homeworks.homework1.obstacles.Treadmill;
import geekbrains.homeworks.homework1.obstacles.Wall;

public class Creature {
    public boolean failed;
    protected String name = this.name;
    protected int runningDistance = this.runningDistance;
    protected int jumpingHeight = this.jumpingHeight;

    public Creature(String name, int runningDistance, int jumpingHeight) {
        this.name = name;
        this.runningDistance = runningDistance;
        this.jumpingHeight = jumpingHeight;
    }

    public void jumpWall(Wall wall){
        if (wall.ifCanJump(jumpingHeight)){
            System.out.println( name + " has jumped the wall");
        } else {
            System.out.println(name + " Too high for me:(");
            failed = true;
        }
    }
    public void runTreadmill(Treadmill treadmill){
        if(treadmill.ifCanRun(runningDistance)){
            System.out.println(name + " has run the distance!");
        } else {
            System.out.println(name + " Too long distance for me");
            failed = true;
        }
    }
}
