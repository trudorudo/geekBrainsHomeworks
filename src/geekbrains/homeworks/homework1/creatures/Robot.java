package geekbrains.homeworks.homework1.creatures;

import geekbrains.homeworks.homework1.iterfaces.Jumping;
import geekbrains.homeworks.homework1.iterfaces.Running;

public class Robot extends Creature implements Running, Jumping {
    public Robot(String name, int runningDistance, int jumpingHeight) {
        super(name, runningDistance, jumpingHeight);
    }
    @Override
    public void running() {
        System.out.println("Robot is running");
    }
    @Override
    public void jumping(){
        System.out.println("Robot is jumping");
    }
}
