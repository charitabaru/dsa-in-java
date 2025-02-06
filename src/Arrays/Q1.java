package Arrays;

//1920
// https://leetcode.com/problems/build-array-from-permutation/description/
// Build Array from Permutation

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] num = {0,2,1,5,4,3};
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++){
            ans[i] = num[num[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
