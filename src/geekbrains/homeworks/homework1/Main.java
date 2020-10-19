package geekbrains.homeworks.homework1;


import com.sun.codemodel.internal.JForEach;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 6);
        Plate plate = new Plate(10);
        plate.info();
        cat.eat(plate);
        cat.checkIfHungry(plate);
        plate.info();
        plate.addMoreFood(3);
        plate.info();

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Mus'ka", 3);
        catArray[1] = new Cat("Gosha", 18);
        catArray[2] = new Cat("Bars", 20);

        for (Cat cats : catArray){
            cat.eat(plate);
            cat.checkIfHungry(plate);
        }
    }
}

