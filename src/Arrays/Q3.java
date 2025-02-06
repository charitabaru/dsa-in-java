package Arrays;

//1480
// https://leetcode.com/problems/running-sum-of-1d-array/description/
// Running Sum of 1d Array

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] runningSum = new int[nums.length];
        int sum =0;
        for (int i = 0; i < nums.length; i++ ){
            sum += nums[i];
            runningSum[i] = sum;
        }
        System.out.println(Arrays.toString(runningSum));
    }
}
