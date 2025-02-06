package KunalKushwaha.BinarySearch;

public class targetValue {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,63,48};
        int target = 59;
        int ans = searchTargetValue(arr,target);
        System.out.println(ans);
    }
    static int searchTargetValue(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            //In Java, the maximum value for an int is 2^31 - 1 = 2,147,483,647.
            /* Calculating (start + end),
             2,000,000,000 + 2,000,000,010 = 4,000,000,010 */
            // int middle = start + end / 2
            // might possible that (start + end) will exceed the range of int in java.
            int middle = start + (end - start) / 2; // To prevent overflow in large arrays
            if (arr[middle] < target){
                start = middle + 1;
            } else if (arr[middle] > target) {
                end = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
