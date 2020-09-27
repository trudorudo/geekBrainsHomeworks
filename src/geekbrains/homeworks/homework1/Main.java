package geekbrains.homeworks.homework1;

public class Main {

    public static void main(String[] args) {
        byte newByte = 100;
        short newShort = 200;
        int newInt = 500;
        long newLong = 400000;
        float newFloat = 10.5f;
        double newDouble = 300.2;
        char newChar = 'g';
        boolean newBoolean = true;

        taskThree(2,3,4,5);
        taskFour(2,5);
        taskFive(0);
        taskSix(-4);
        taskSeven("Vasya");
        taskEight(2000);
    }

    private static int taskThree (int a, int b, int c, int d){
        int e = a * (b + (c / d));
        return e;
    }

    private static boolean taskFour (int a, int b){
        int mySum = Integer.sum(a,b);
        if( mySum > 10 && mySum < 20 ){
            return true;
        } else {
            return false;
        }
    }

    private static void taskFive(int a){
        if( a >= 0 ){
            System.out.println("You've passed positive number :)");
        } else {
            System.out.println("You've passed negative number :(");
        }
    }

    private static boolean taskSix (int a){
        if(a < 0){
            return true;
        }
        return false;
    }

    private static void taskSeven (String name){
        System.out.println("Hello " + name);
    }

    private static void taskEight(int year){
        boolean isLeap = false;
        boolean cond1 = year % 4 == 0;
        boolean cond2 = year % 100 == 0;
        boolean cond3 = year % 400 == 0;
        if( cond1 && cond2 && cond3 ){
            isLeap = true;
        }
        if(isLeap){
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}

