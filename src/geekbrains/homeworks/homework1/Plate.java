package geekbrains.homeworks.homework1;

public class Plate {
    protected int food;
    protected boolean catAte;
    public Plate(int food)
    {
        this.food = food;
    }

    public void decreaseFood(int appetite){
        if(appetite > food){
            System.out.println("not enough food to eat");
            catAte = false;
        } else {
            food -= appetite;
            System.out.println("cat ate!");
            catAte = true;
        }
    }

    public void info(){
        System.out.println("plate " + food );
    }
    public void addMoreFood(int moreFood){
        food += moreFood;
        System.out.println("food:" + food);
    }
}
