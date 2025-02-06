package KunalKushwaha.LinearSearch;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 56, 67, 88},
                {5, 6, 90, 57}
        };
        int max = arr[0][1];
        int ans = maximum(arr,max);
        System.out.println(ans);
    }
    static int maximum(int[][] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
