package LeetCode.Easy;

import java.util.Scanner;

public class L3162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1= {1,3,4};
        int[] nums2 = {1,3,4};
        System.out.print("Enter K Value = ");
        int k = sc.nextInt();
        int ans = numberOfPairs(nums1,nums2,k);
        System.out.println(ans);
    }
    static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        int count = 0;
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < m; j++){
                if(nums1[i]%(nums2[j]*k) == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
