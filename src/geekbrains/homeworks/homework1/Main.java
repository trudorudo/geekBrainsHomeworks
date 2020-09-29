package geekbrains.homeworks.homework1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myNums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] myNums2 = new int[8];
        myNums2 = new int[]{0, 3, 6, 9, 12, 15, 18, 21};
        int[] myNums3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        replaceOneAndZero(myNums);
        createArray(myNums2);
        incrementSmallNumbers(myNums3);
        drawDiagonal();
    }

    private static void replaceOneAndZero(int[] myNums){
        for(int i = 0; i < myNums.length; i++){
            if ( myNums[i] == 1 ) {
                myNums[i]=0;
            }
            else if (myNums[i] == 0){
                myNums[i] = 1;
            }
        }
        System.out.println(Arrays.toString(myNums));
    }

    private static void createArray(int[] myNums2){
        System.out.println(Arrays.toString((myNums2)));
    }

    private static void incrementSmallNumbers(int[] myNums3){
        for (int i = 0; i < myNums3.length; i++){
            if(myNums3[i] < 6){
                myNums3[i] = myNums3[i] * 2;
            }
        }
    }

    private static void drawDiagonal(){
        int[][] myMultiDimensional = new int[5][5];
        for(int i = 0; i < myMultiDimensional.length; i++){
            for(int j = 0; j < myMultiDimensional.length; j++){
                if(i == j){
                    myMultiDimensional[i][j] = 1;
                }
                if((i + j) == (myMultiDimensional.length - 1)){
                    myMultiDimensional[i][j]= 1;
                }
            }
        }
        System.out.println(Arrays.deepToString((myMultiDimensional)));
    }

}