package geekbrains.homeworks.homework1;

public class Plate {
    protected int food;
    public Plate(int food)
    {
        this.food = food;
    }

    public void decreaseFood(int appetite){
        if(!hasEnoughFood(appetite)){
            System.out.println("not enough food to eat");
        } else {
            food -= appetite;
        }
    }
    public boolean hasEnoughFood(int appetite)
    {
        return appetite <= food;
    }
    public void info(){
        System.out.println("plate " + food );
    }
    public void addMoreFood(int moreFood){
        food += moreFood;
        System.out.println("food:" + food);
    }
}
