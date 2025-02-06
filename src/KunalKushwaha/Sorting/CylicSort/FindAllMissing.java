package KunalKushwaha.Sorting.CylicSort;
import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = missing(nums);
        System.out.println(ans);
    }

    static List<Integer> missing(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
