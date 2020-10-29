package geekbrains.homeworks.homework1.creatures;

import geekbrains.homeworks.homework1.iterfaces.Jumping;
import geekbrains.homeworks.homework1.iterfaces.Running;
import geekbrains.homeworks.homework1.obstacles.Treadmill;
import geekbrains.homeworks.homework1.obstacles.Wall;

public class Cat extends Creature implements Running, Jumping {

    public Cat(String name, int runningDistance, int jumpingHeight) {
        super(name, runningDistance, jumpingHeight);
    }


    @Override
    public void running() {
        System.out.println("Cat is running");
    }

    @Override
    public void jumping(){
        System.out.println("Cat is jumping");
    }
}
