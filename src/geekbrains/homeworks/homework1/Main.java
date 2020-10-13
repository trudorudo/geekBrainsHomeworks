package geekbrains.homeworks.homework1;


import com.sun.codemodel.internal.JForEach;

public class Main {

    public static void main(String[] args){
        Cat cat = new Cat(20, 5);
        Dog dog = new Dog(40,0, 10);

        cat.run();
        cat.jump();

        dog.run();
        dog.swim();
        dog.jump();
    }
}

