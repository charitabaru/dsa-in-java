package KunalKushwaha.BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peak = peakSearch(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            System.out.println(firstTry);
        }else {
            System.out.println(orderAgnosticBS(arr, target, peak + 1, arr.length - 1));
        }
    }
    static int orderAgnosticBS(int[] arr,int target,int start, int end){
        boolean isAsc = arr[start] < arr[end];

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
        return -1;
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
        return start;
    }
}
