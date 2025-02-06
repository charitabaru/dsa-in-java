package KunalKushwaha.BinarySearch;

/* In sorted arrays, finding the floor of a number can mean finding the greatest element in the array
  that is less than or equal to a given value. For example, given a sorted array [1, 2, 4, 6, 10]
  and a target of 5, the floor is 4 because it's the largest element less than 5. */

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,9,12,16,18,20,22,23};
        int target = 0;
        int ans = searchTargetValue(arr,target);
        System.out.println(ans);
    }
    static int searchTargetValue(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];
        if (target < arr[start]){
            return -1;
        }
        while (start <= end){

            int middle = start + (end - start) / 2; // To prevent overflow in large arrays

            if (arr[middle] == target){
                return middle;
            }
            if (isAsc){
                if (arr[middle] < target){
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (arr[middle] < target){
                    end = middle - 1;

                } else  {
                    start = middle + 1;
                }
            }
        }
        return arr[end];
    }
}
