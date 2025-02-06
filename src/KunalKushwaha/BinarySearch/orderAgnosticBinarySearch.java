package KunalKushwaha.BinarySearch;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {2,4,6,9,11,12,14,20,63,48};
        int[] arr = {89,78,69,56,45,34,20,12,10,9};
        int target = 56;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

//        if (arr[start] < arr[end]){
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }

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
}
