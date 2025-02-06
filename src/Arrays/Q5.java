package Arrays;

//1470
// https://leetcode.com/problems/shuffle-the-array/description/
// shuffle the array

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int[] ans = new int[nums.length];
        int n = 3;
        for (int i =0; i < n; i++){
            ans[2*i] = nums[i];
            ans[(2*i)+1] = nums[i+n];
        }
        System.out.println(Arrays.toString(ans));
    }
}
