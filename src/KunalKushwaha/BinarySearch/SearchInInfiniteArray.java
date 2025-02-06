package KunalKushwaha.BinarySearch;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Find position of an element in a sorted array of infinite numbers

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,63,48};
        int target = 12;
        int ans = rangeSet(arr,target);
        System.out.println(ans);
    }
    static int rangeSet(int[] arr,int target){
        int start = 0;
        int end = 1;

        while (end <= arr.length && (target > arr[end])){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        if (end > arr.length){
            end = arr.length - 1;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < target) {
                start = middle + 1;
            } else if (arr[middle] > target) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
