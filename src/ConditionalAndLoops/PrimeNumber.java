package ConditionalAndLoops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n==0||n==1){
            System.out.println(n + " is neither prime nor composite.");
        }else {
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.println(n + " is Prime Number");
            }else {
                System.out.println( n + " not a prime number");
            }
        }

    }
}
