package LeetCode.Easy;

import java.util.Scanner;

public class L2652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumOfMultiples(n);
        System.out.println(ans);
    }
    static int sumOfMultiples(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum += i;
            }
        }
        return sum;
    }
}
