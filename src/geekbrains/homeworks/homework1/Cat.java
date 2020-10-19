package geekbrains.homeworks.homework1;

public class Cat {
    private boolean isFull;
    protected String name;
    protected int appetite;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate){
        plate.decreaseFood(appetite);
    }
    public void checkIfHungry(Plate plate){
        if(plate.catAte){
            System.out.println("I am full");
        } else {
            System.out.println("I am hungry");
        }
    }
}
