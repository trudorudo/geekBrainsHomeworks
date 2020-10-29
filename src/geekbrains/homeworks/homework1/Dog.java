package geekbrains.homeworks.homework1;

public class Dog extends Animal{
    float swimDistance;
    public Dog(float runDistance, float jumpHeight, float swimDistance) {
        super(runDistance, jumpHeight);
        this.swimDistance = swimDistance;
    }

    @Override
    public void run(){
        if(runDistance > 500){
            System.out.println("too tired to run " + runDistance + "m..");
        } else {
            System.out.println("run run run" + runDistance);
        }
    }
    @Override
    public void jump(){
        if(jumpHeight > 0.5){
            System.out.println("Dogs can't jump that high " + jumpHeight + "m.");
        } else {
            System.out.println("jump jump jump" + jumpHeight);
        }
    }
    public void swim(){
        if(swimDistance > 10){
            System.out.println("Too tired to swim that long  " + swimDistance + "m.");
        } else {
            System.out.println("swim swim swim " + swimDistance + "m.");
        }
    }
}
