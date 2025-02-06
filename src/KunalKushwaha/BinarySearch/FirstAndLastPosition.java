package KunalKushwaha.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = {-1,-1};
        int start = index(nums,target,true);
        int end = index(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
    }
        static int index(int[] nums, int target, boolean isFirstIndex){
            int ans = -1;
            int start = 0;
            int end = nums.length -1;

            while (start <= end){
                int middle = start + (end - start) / 2; // To prevent overflow in large arrays
                if (nums[middle] < target){
                    start = middle + 1;
                } else if (nums[middle] > target) {
                    end = middle - 1;
                }else {
                    ans = middle;
                   // possible ans
                    if (isFirstIndex){
                        end = middle -1;
                    }else {
                        start = middle +1;
                    }
                }
            }
            return ans;
        }
}
