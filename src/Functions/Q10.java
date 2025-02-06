package Functions;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (palindrome(n) == n){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

    }
    static int palindrome(int n ){
        int reverse =0;
        while(n >0){
            int temp = n % 10;
            reverse = reverse * 10 + temp;
            n /= 10;
        }
        return reverse;
    }
}
