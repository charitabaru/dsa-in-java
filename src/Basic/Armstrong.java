package Basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int newNum = n;
        int digits = String.valueOf(n).length();

        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            n /= 10;
            sum += (int) (Math.pow(temp,digits));
       }

        if (sum == newNum){
            System.out.println( newNum + " is an armstrong number");
        }else {
            System.out.println( newNum + " is not an armstrong number");
        }

    }
}
