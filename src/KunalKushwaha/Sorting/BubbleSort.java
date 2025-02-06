package KunalKushwaha.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {10,20,50,10,20};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
    static int[] sortColors(int[] nums) {
        int n = nums.length;

        for(int i =0;i<n;i++){
            boolean swapped = false;
            for(int j =1; j< n-i; j++){
                //check if the current number is less than the previous number then swap()
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;

                    swapped = true;
                }

            }
            if(!swapped){ // !false gives true and breaks i.e, when no swap loop breaks
                break;
            }
        }
        return nums;
    }
}
