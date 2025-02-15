package KunalKushwaha.Recursion.Patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr, int r,int c,int Max){
        if(r==0) {
            return;
        }
        if(c<r) {
            if (arr[c] > arr[Max]) {
                selectionSort(arr,r,c+1,c);
            }else{
                selectionSort(arr,r,c+1,Max);
            }
        }
        else{
            //swap
            int temp = arr[Max];
            arr[Max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr,r-1,0,0);
        }
    }
}
