package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//1389
// https://leetcode.com/problems/create-target-array-in-the-given-order/description/
//  Create Target Array in the Given Order

public class Q9 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = new int[nums.length];

        ArrayList<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < index.length; i++){
            int indic = index[i];
            targetList.add(indic,nums[i]);
        }
        for (int i = 0; i <target.length;  i++){
            target[i] = targetList.get(i);
        }
        System.out.println(Arrays.toString(target));
    }
}
