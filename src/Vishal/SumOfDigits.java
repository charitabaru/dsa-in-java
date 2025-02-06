package Vishal;

import java.util.Scanner;

/*

Declare a variable n and store a number in it. Declare two more variables rem and sum. Your task is to calculate
the sum of the digits of the number, rem will be used for storing the digits, and sum will be used to store the sum
of those digits.

For example

N = 12345

Sum of digits will be = 15

*/

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        while (n > 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println(sum);
    }
}
