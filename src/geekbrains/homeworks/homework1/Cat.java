package geekbrains.homeworks.homework1;

public class Cat extends Animal {
    public Cat(int runDistance, int jumpHeight) {
        super(runDistance, jumpHeight);
    }

    @Override
    public void run(){
        if(runDistance > 200){
            System.out.println("I am cat  I can't run that much :(");
        } else {
            System.out.println("Run run run" + runDistance);
        }
    }

    @Override
    public void jump(){
        if(jumpHeight > 2){
            System.out.println("Cats can't jump that high " + jumpHeight + "m.");
        } else {
            System.out.println("jump jump jump" + jumpHeight);
        }
    }
}
