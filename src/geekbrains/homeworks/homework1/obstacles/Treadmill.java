package geekbrains.homeworks.homework1.obstacles;

import geekbrains.homeworks.homework1.iterfaces.ITreadmill;

public class Treadmill extends Obstacle implements ITreadmill {
    protected int distance = this.distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }
    @Override
    public boolean ifCanRun(int runningDistance) {
        return distance <= runningDistance;
    }
}
