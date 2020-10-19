package geekbrains.homeworks.homework1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Cat {
    private boolean isFull;
    protected String name;
    protected int appetite;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }
    public void eat(Plate plate){
        if(plate.hasEnoughFood(appetite) && !isFull){
            plate.decreaseFood(appetite);
            isFull=true;
            System.out.println("Cat " + name + " ate");
        } else if(isFull) {
            System.out.println("Cat " + name + " is not hungry");
        } else {
            System.out.println("not enough food in the plate");
        }
    }
}
