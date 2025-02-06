package KunalKushwaha.Sorting.CylicSort;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums ={3,0,1};
        int i =0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        int ans =missing(nums);
        System.out.println(ans);

    }
    static int missing(int[] nums){
        for(int index =0; index<nums.length;index++){
            if(nums[index] != index){
                return index;
            }
        }

        return nums.length;
    }
    static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
