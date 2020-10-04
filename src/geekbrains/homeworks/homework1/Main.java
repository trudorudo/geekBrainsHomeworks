package geekbrains.homeworks.homework1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        guessTheNumber();
    }
    private static void tryAgainCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's try again? Type Yes/No");
        if (scanner.next().equalsIgnoreCase("no")) {
            System.out.println("OK...See you later");
            scanner.close();
        } else {
            System.out.println("Yey, let's play");
            guessTheNumber();
        }
    }
    private static void guessTheNumber(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int newRandom = random.nextInt(10);
        int attempts = 0;
        while( attempts < 3 ){

            System.out.println("Enter any number from 0 to 9");

            if( scanner.hasNextInt() ){
                String guessedNumber = scanner.nextLine();
                int guessedNumInt = Integer.parseInt(guessedNumber);
                boolean ifInsideRange = guessedNumInt >= 0 && guessedNumInt <= 9;
                attempts++;
                if(guessedNumInt == newRandom && ifInsideRange){
                    System.out.println("You guessed it right, winner!");
                    attempts = 0;
                    tryAgainCheck();
                } else if (guessedNumInt > newRandom && ifInsideRange){
                            System.out.println("Less");
                        } else {
                            System.out.println("More");
                        }
            } else {
                System.out.println("You can use only numeric symbols from 0 to 9.");
                tryAgainCheck();
            }
        }
        System.out.println("Game is over");
        tryAgainCheck();
    }
}

