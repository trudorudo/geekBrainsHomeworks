package geekbrains.homeworks.java2;

import com.sun.tools.javac.util.List;
import geekbrains.homeworks.java2.Fruits.Fruit;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList box;

    public Box(List<T> box) {
        this.box = new ArrayList<>();
    }

    public Box(T... fruits) {
       this.box = new ArrayList(Arrays.asList(fruits));
    }

    public float getWeight(){
        float weight = 0.0f;
        for(Object fruit : box){
            weight += Fruit.getWeight();
        }
        return weight;
    }
    public boolean compare(Box<?> box2){
        if(Math.abs(this.getWeight() - box2.getWeight()) < 0.0001){
            return true;
        }
        return false;
    }
    public void addFruits (T fruit){
        box.add(fruit);
    }
    public void changeBox(Box<? super T> box2){
        if(!box2.equals(this)){
            box2.box.addAll(this.box);
            this.box.clear();
        }
    }
}
