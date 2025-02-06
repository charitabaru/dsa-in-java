package Functions;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.print("Prime numbers between " + start + " and " + end + " are: ");
        printPrimes(start, end);
    }
    static void printPrimes(int num1,int num2){
        for (int i = num1; i <= num2; i++){
            if (i <= 1) {
                continue;   // Skip to next iteration
            }
            boolean isprime = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isprime = false;
                    break;
                }
            }
            if (isprime){
                System.out.print(i + " ");
            }
        }
    }
}
