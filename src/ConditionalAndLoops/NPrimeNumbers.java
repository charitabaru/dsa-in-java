package ConditionalAndLoops;

import java.util.Scanner;

public class NPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       /* for (int i = 2; i<=n; i++){
           boolean result =  primeChecker(i);
           if(result){
               System.out.println(i);
           }
        }
        */

        for (int i = 2; i <= n; i++){
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

    /*

    public static boolean primeChecker(int n ){
        if (n==2){
           return true;
        }
        else {
            for (int i = 2; i < n; i++){
                if(n % i == 0 ) {
                    return false;
                }
            }
            return true;
        }
    }
     */

    }
