package KunalKushwaha.LinearSearch;

public class maxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for (int person =0; person < arr.length; person++){
            int rowSum = 0;
            for (int account = 0; account < arr[person].length; account++){
                int element = arr[person][account];
                rowSum += element;
            }
            if (rowSum > ans){
                ans = rowSum;
            }
        }
        return ans;
    }
}
