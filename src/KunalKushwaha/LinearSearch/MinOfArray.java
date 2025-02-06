package KunalKushwaha.LinearSearch;

public class MinOfArray {
    public static void main(String[] args) {
        int[] arr = {23,45,6,89,45};
        int min = arr[0];
        int result = minimum(arr,min);
        System.out.println("The minimum value in the array is " + result);
    }
    static int minimum(int[] arr, int min){
        for(int i = 1; i < arr.length; i++){
            if ( min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
