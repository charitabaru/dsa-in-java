package KunalKushwaha.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,4,99,88,56,18,-43,-23,33};
        int target = 33;

        int indexNumber = linearSearch(nums,target);
        System.out.println(indexNumber);
    }
    static int linearSearch(int [] nums,int traget){
        if(nums.length == 0){
            return -1;
        }
        for (int index =0; index < nums.length; index++){
            int element = nums[index];
            if (element == traget){
                return index;
            }
        }
        return -1;
    }

}
