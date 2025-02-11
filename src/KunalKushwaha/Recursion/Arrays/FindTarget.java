package KunalKushwaha.Recursion.Arrays;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,5};
        System.out.println(target(arr,7,0));
    }
    public static boolean target(int[] arr,int target,int i){
        if(i>arr.length -1){
            return false;
        }
        return arr[i] == target || target(arr,target,i+1);
    }
}
