package KunalKushwaha.LinearSearch;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[][] arr = {
                {23,7},
                {906,67},
                {3,8,45678,34,123456,-1234}
        };
       int ans =  findNUmber(arr);
        System.out.println("Total "+ ans + " Even Digit Numbers in a 2D Array.");
    }

    static int findNUmber(int[][] arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = arr[i][j];
               if (even(num)){
                   count++;
               }
            }
        }
      return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }


    static int digits(int number){
        if (number < 0){
            number *= -1;
        }
        if (number == 0){
            return 1;
        }
        int count = 0;
             while (number > 0){
                count++;
                 number /= 10;
             }
        return count;
    }
}
