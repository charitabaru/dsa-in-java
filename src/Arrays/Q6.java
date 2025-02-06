package Arrays;

//1431
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
// Kids With the Greatest Number of Candies

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int n = candies.length;
        int extraCandies = 10;
        boolean[] result = new boolean[n];
        int max = 0;

        for(int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i =0; i < n; i++){
         result[i] = candies[i]+extraCandies >= max;
        }
        System.out.println(Arrays.toString(result));
    }
}
