package geekbrains.homeworks.homework1.obstacles;

import geekbrains.homeworks.homework1.iterfaces.IWall;

public class Wall extends Obstacle implements IWall {
    protected int height = this.height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean ifCanJump(int jumpingHeight){
        return height <= jumpingHeight;
    }
}
