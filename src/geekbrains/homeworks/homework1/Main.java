package geekbrains.homeworks.homework1;


import com.sun.codemodel.internal.JForEach;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(10);
        plate.info();
        plate.addMoreFood(30);
        plate.info();

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Mus'ka", 3);
        catArray[1] = new Cat("Gosha", 18);
        catArray[2] = new Cat("Bars", 20);

        for (Cat cats : catArray){
            cats.eat(plate);
        }
    }
}

