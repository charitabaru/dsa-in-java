package KunalKushwaha.Recursion.Arrays;

import java.util.ArrayList;

public class findAllIndex {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,4,5};
        targetAllIndexPositions(arr,0,4);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void targetAllIndexPositions(int[] arr, int i ,int target){
        if(i > arr.length -1){
            return;
        }
        if(arr[i] == target){
            list.add(i);
        }
        targetAllIndexPositions(arr,i+1,target);
    }
}
