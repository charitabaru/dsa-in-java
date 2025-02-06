package KunalKushwaha.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,3,4,1,2};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void insertion(int[] nums){
        for(int i =0; i<=nums.length-2;i++){
            for(int j = i+1;j>0;j--){
                if(nums[j] < nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
