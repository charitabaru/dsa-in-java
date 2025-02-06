package LeetCode.Easy;

public class L1800 {
    public static void main(String[] args) {
        int[] nums = {12,17,15,13,10,11,12};
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int currentSum = nums[0];
        int endSum = currentSum;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                    currentSum += nums[i];
            } else {
                    currentSum = nums[i];
            }
                endSum = Math.max(endSum, currentSum);
        }

        return endSum;
    }
}

