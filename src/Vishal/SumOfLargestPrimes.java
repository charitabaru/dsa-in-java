package Vishal;

import java.util.Scanner;

/*

Given a positive integer n as an input. Your task is to find the sum of the largest prime factor
of each number less than or equal to n.

For example,

Input : 10

Output : 32

Explanation:  The sum of the largest prime factors of (2,3,4,5,6,7,8,9,10) is 2+3+2+5+3+7+2+3+5= 32.

*/

public class SumOfLargestPrimes {

    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {  // If divisible, not prime
                return false;
            }
        }
        return true;  // If no divisors, the number is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int largestPrimeFactor = -1;

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (isPrime(j)) {
                        largestPrimeFactor = j;
                    }
                }
            }
            sum += largestPrimeFactor;
        }
        System.out.println("The sum of Largest Prime Factors is : "+ sum);

    }
}
