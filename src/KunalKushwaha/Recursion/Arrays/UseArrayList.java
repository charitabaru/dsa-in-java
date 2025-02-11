package KunalKushwaha.Recursion.Arrays;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,45,6,4};
        ArrayList<Integer> ans = findAllIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);
//        ArrayList<Integer> ans2 = findAllIndex2(arr,4,0);
//        System.out.println(ans2);

    }
    //Best Approach is this method only.
    public static ArrayList<Integer> findAllIndex(int[] arr,int target,int i ,ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return findAllIndex(arr,target,i+1,list);
    }

    // another Approach where return list without passing the arraylist in the argument.
//    public static ArrayList<Integer> findAllIndex2(int[] arr,int target,int i){
//        ArrayList<Integer> list = new ArrayList<>();
//        if(i == arr.length){
//            return list;
//        }
//        if(arr[i] == target){
//            list.add(i);
//        }
//        ArrayList<Integer> indexFromBeforeCalls =  findAllIndex2(arr,target,i+1);
//        list.addAll(indexFromBeforeCalls);
//        return list;
//    }

}
