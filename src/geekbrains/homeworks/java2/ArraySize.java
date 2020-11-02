package geekbrains.homeworks.java2;


public class ArraySize {
    public static void main(String[] args) {
        String[][] a = new String[][]{{"1", "khl", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try{
            int result = method(a);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }


    }
    public static int method(String[][] a) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if(a.length != 4 && a[0].length != 4){
            throw new MyArraySizeException("Size of the array is correct");
        }
        for (int i = 0; i <= a.length; i++){
            for (int j = 0; j <= a.length; j++){
                try {
                    sum += Integer.parseInt(a[i][j]);
                    System.out.println("Sum = " + sum);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Not an integer");
                }
            }
        }
        return sum;
    }
}
