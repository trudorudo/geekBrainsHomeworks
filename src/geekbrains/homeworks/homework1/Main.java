package geekbrains.homeworks.homework1;


import geekbrains.homeworks.homework1.creatures.Cat;
import geekbrains.homeworks.homework1.creatures.Creature;
import geekbrains.homeworks.homework1.creatures.Human;
import geekbrains.homeworks.homework1.creatures.Robot;
import geekbrains.homeworks.homework1.obstacles.Obstacle;
import geekbrains.homeworks.homework1.obstacles.Treadmill;
import geekbrains.homeworks.homework1.obstacles.Wall;

public class Main {

    public static void main(String[] args) {
        Creature[] creatures = {
                new Cat("Barsik", 20, 3),
                new Human("Peter", 40, 20),
                new Robot("Robo", 90, 1)
        };

        Obstacle[] obstacles = new Obstacle[]{
                new Treadmill(30),
                new Wall(2),
                new Wall(40),
                new Treadmill(4)
        };

        for(Creature creature : creatures){
            for(Obstacle obstacle : obstacles){
                if(obstacle instanceof Wall){
                    Wall wall = (Wall) obstacle;
                    Creature.class.cast(creature).jumpWall(wall);
                    if(creature.failed){
                        break;
                    }
                }
                if(obstacle instanceof Treadmill){
                    Treadmill treadmill = (Treadmill) obstacle;
                    Creature.class.cast(creature).runTreadmill(treadmill);
                    if(creature.failed){
                        break;
                    }
                }
            }
        }
   }
}

