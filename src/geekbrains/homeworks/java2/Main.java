package geekbrains.homeworks.java2;

import com.sun.tools.corba.se.idl.constExpr.Or;
import geekbrains.homeworks.java2.Fruits.Apple;
import geekbrains.homeworks.java2.Fruits.Fruit;
import geekbrains.homeworks.java2.Fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main<box2> {
    public static void main(String[] args) {
        // fruit boxes
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruits(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruits(new Orange());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruits(new Orange());
        appleBox1.compare(orangeBox1);
        orangeBox1.changeBox(orangeBox2);
        orangeBox2.getWeight();
        appleBox1.compare(orangeBox1);


        String[] myArray = {"a","b","c"};
        ArrayList<String> myArrList = arrayToList(myArray);
        System.out.println(myArrList);
        System.out.println(swap(myArray,2,1));
    }

    private static <T> ArrayList<T> arrayToList(T[] myArray) {
        return new ArrayList<>(Arrays.asList(myArray));
    }

    public static <T> T[] swap(T[] myArray, int index1, int index2){
        T firstEl = myArray[index1];
        myArray[index1] = myArray[index2];
        myArray[index2] = firstEl;
        return myArray;
    }
}
