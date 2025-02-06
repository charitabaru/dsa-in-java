package KunalKushwaha.BinarySearch;

public class SmallestLetterGreaterThenTarget {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'c';
        char ans = (char) searchTargetValue(arr,target);
        System.out.println(ans);
    }

    static int searchTargetValue(char[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int middle = start + (end - start) / 2; // To prevent overflow in large arrays

            if (isAsc) {
                if (arr[middle] <= target) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (arr[middle] <= target) {
                    end = middle - 1;

                } else {
                    start = middle + 1;
                }
            }
        }
        return arr[start % arr.length];
    }
}
