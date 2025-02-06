package KunalKushwaha.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums ={3,4,5,1,2};
        int pivot = findPivotIndex(nums);
        int min = pivot + 1;
        System.out.println("rotations count = " + min);
        System.out.println("minimum = "+nums[min]);
    }
    static int findPivotIndex(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            // case 1
            if (mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            // case 2
            if (mid > start && nums[mid] < nums[mid -1]){
                return mid-1;
            }

            // reduce search range by comparing

            if (nums[mid] >= nums[start]){
                start = mid + 1;
            }else {
                end= mid -1;
            }
        }
        return -1;
    }
}
