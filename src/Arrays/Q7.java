package Arrays;

// 1512
//  https://leetcode.com/problems/number-of-good-pairs/description/
//  Number of Good Pairs

public class Q7 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int count = 0;
        for (int i =0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                    if (nums[i] == nums[j]){
                        count++;
                    }
            }
        }
        System.out.println(count);
    }
}
