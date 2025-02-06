package KunalKushwaha.BinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// Find Peak index of a Mountain Array.

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,18,13,12,11};
        System.out.println(peakSearch(arr));
    }
    static int peakSearch(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
