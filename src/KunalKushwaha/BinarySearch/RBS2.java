package KunalKushwaha.BinarySearch;

public class RBS2 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 8;
        int pivotIndex =  findPivotInDuplicates(nums);
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
    static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;

            // Check if the middle element is the target
            if (nums[middle] == target) {
                return true;
            }

            // Adjust search bounds based on the order
            if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return false; // Target not found
    }


    static int findPivotInDuplicates(int[] nums){
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
            //case 3
            if(nums[start]==nums[mid] && nums[end] == nums[mid]){
                if( start < nums.length - 1&& nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(end > 0 && nums[end]<nums[end - 1]){
                    return end-1;
                }
                end--;
            }else{// reduce search range by comparing
                if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[end] < nums[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
