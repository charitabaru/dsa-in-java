package KunalKushwaha.BinarySearch;

public class RotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int pivotIndex =  findPivot(nums);
        // if there is no pivot found means the array is not rotated just apply normal binary search
        if (pivotIndex == -1){
            System.out.println(binarySearch(nums,target,0,nums.length -1));
        }
        // pivot is equal to target
        if (nums[pivotIndex] == target){
            System.out.println(pivotIndex);
        }
        // if target >= start the search space is reduced to pivot-1 as the target will be greater than start means it
        // will not lie after the pivot value.

        if (target >= nums[0]){
            System.out.println( binarySearch(nums,target,0,pivotIndex -1));
        }else {
            System.out.println( binarySearch(nums,target,pivotIndex +1,nums.length -1));;
        }

    }

    static int binarySearch(int[] nums, int target, int start, int end){
        boolean isAsc = nums[start] < nums[end];

        while (start <= end){

            int middle = start + (end - start) / 2; // To prevent overflow in large arrays

            if (nums[middle] == target){
                return middle;
            }
            if (isAsc){
                if (nums[middle] < target){
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (nums[middle] < target){
                    end = middle - 1;

                } else  {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
    static int findPivot(int[] nums){
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
                start= mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
