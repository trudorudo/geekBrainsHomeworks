package geekbrains.homeworks.homework1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myNums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] myNums2 = new int[8];
        myNums2 = new int[]{0, 3, 6, 9, 12, 15, 18, 21};
        int[] myNums3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] myNums4 = new int[]{2, 3, 4, 1, 4};
        replaceOneAndZero(myNums);
        createArray(myNums2);
        incrementSmallNumbers(myNums3);
        drawDiagonal();
         findMinAndMax(myNums2);
        System.out.println(findMinAndMax(myNums3));
        findPartsSum(myNums2);
        // findPartsSum returns true
        System.out.println(findPartsSum(myNums2));
        // findPartsSum returns false
        System.out.println(findPartsSum(myNums4));
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

    private static String findMinAndMax(int[] myNums2) {
        int maxValue = myNums2[0];
        int minValue = myNums2[0];
        for (int i = 0; i < myNums2.length; i++) {
            if (myNums2[i] > maxValue) {
                maxValue = myNums2[i];
            }
            if(myNums2[i] < minValue){
                minValue = myNums2[i];
            }
        }
        String result = "Min value is " + minValue + ". Max value is " + maxValue + ".";
        return result;
    }
    private static boolean findPartsSum(int[] myNums2){
        int sumLeft = 0;
        int sumRight = 0;
        for(int i = 0; i < myNums2.length; i++){
            if(sumLeft <= sumRight){
                sumLeft+=myNums2[i];
                i++;
            } else {
                int j=myNums2.length-1;
                sumRight+=myNums2[j];
                j--;
            }
            if(sumLeft != 0 && sumLeft == sumRight ){
                return true;
            }
        }
        return false;
    }
}