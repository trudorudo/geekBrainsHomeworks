package geekbrains.homeworks.homework1;

public class Animal {
    float runDistance;
    float jumpHeight;

    public Animal(float runDistance, float jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }
    public void run(){
        System.out.println("run " + runDistance);
    }
    public void jump(){
        System.out.println("jump " + jumpHeight);
    }
}
