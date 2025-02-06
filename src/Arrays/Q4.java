package Arrays;

//1672
// https://leetcode.com/problems/richest-customer-wealth/description/
//  Richest Customer Wealth

public class Q4 {
    public static void main(String[] args) {
        int[][] accounts = {{1,5,3},{1,4,2}};

        int maxWealth = 0;
        for (int person = 0; person < accounts.length; person++){
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                rowSum = rowSum + accounts[person][account];
            }
            if (rowSum > maxWealth){
                maxWealth = rowSum;
            }
        }
        System.out.println(maxWealth);
    }
}
