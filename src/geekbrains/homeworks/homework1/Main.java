package geekbrains.homeworks.homework1;


import java.util.Random;
import java.util.Scanner;

public class Main {
    static char[][] map;
    static final int SIZE = 3;

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static char dot_human;
    static char dot_ai;
    static boolean humanTurn = false;
    static boolean aiTurn = false;
    static boolean hasEmpty = false;
    static int countWinner = 0;
    public static void main(String[] args){
        ifStartTheGame();
    }
    static void ifStartTheGame(){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Press any key to start the game");
        if( !scanner.next().isEmpty() ){
            pickSymbol();
            initMap();
            printMap();
            playGame();
        }
    }
    static void playGame(){
         while(!hasWinner()){
            if (humanTurn) {
                makeHumanTurn();
            } else {
                makeAiTurn();
            }
        };
        whoIsWinner();
        System.out.println("Game is over");
        System.out.println("Play Again?");
        ifStartTheGame();
    }
    static void pickSymbol(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick X or O");
        String playerInput = scanner.next();
        if( playerInput.toLowerCase().contains("x") || playerInput.toLowerCase().contains("o") ){
            System.out.println("You picked " + playerInput.toUpperCase());
            dot_human = playerInput.charAt(0);
            dot_ai = playerInput.contains("x") ? 'o' : 'x';
            whoIsFirstTurn();
        } else {
            System.out.println("Wrong Key");
            ifStartTheGame();
        }
    }
    static void whoIsFirstTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick any number from 0 to 5, if you guess it right you turn is first!");
        Random random = new Random();
        int newRandom = random.nextInt(10);
        if (scanner.hasNextInt()) {
            String guessedNumber = scanner.nextLine();
            int guessedNumInt = Integer.parseInt(guessedNumber);
            if (guessedNumInt == newRandom && guessedNumInt >= 0 && guessedNumInt <= 5) {
                System.out.println("You guessed it right, your turn is first!");
                humanTurn = true;
            } else {
                System.out.println("Wrong! AI turn is first");
                aiTurn = true;
            }
        }
    }
    static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    static void printMap(){
        for (int i = 0; i <= map.length; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++)
            { System.out.print(map[i][j] + " "); }
            System.out.println();
        }
        System.out.println();
    }
    static void makeHumanTurn(){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do { System.out.println("Enter coordinates X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = dot_human;
        printMap();
        humanTurn = false;
        aiTurn = true;
    }
    static void makeAiTurn() {
        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("AI made turn: " + (x + 1) + " " + (y + 1));
        map[y][x] = dot_ai;
        printMap();
        aiTurn = false;
        humanTurn = true;
    }
    static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }
        else if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean hasWinner(){
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < map.length; i++) {
            diag1 += map[i][i];
            diag2 += map[i][2-i];
        }
        if(diag1 == DOT_O * map.length || diag1 == DOT_X * map.length){
            countWinner = diag1;
            return true;
        }
        if(diag2 == DOT_O * map.length || diag2 == DOT_X * map.length ){
            countWinner = diag2;
            return true;
        }
        for (int i = 0; i < map.length; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < map.length; j++){
                if(map[i][j] == DOT_EMPTY){
                    hasEmpty = true;
                }
                row += map[i][j];
                col += map[j][i];
            }
            if(row == DOT_O * map.length || row == DOT_X * map.length){
                countWinner = row;
                return true;
            }
            if(col == DOT_O * map.length || col == DOT_X * map.length){
                countWinner = col;
                return true;
            }
        }
        return false;
    };
    static void whoIsWinner(){
        if(hasWinner()){
            if(countWinner== DOT_O * map.length){
                System.out.println("O is winner");
            } else {
                System.out.println("X is winner");
            }
        }
    }
}

