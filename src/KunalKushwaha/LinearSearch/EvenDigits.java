package KunalKushwaha.LinearSearch;

import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int [][] arr = new int[][]{
                {1, 2, 3},
                {3, 56, 67, 88},
                {5, 6, 90, 57}
        };
        int[] ans = even(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] even(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
