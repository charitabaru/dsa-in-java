package Functions;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0 || num == 1){
            System.out.println( num +" neither prime nor composite");
        }else {
            System.out.println(prime(num));
        }
    }

    static boolean prime(int num){
        boolean isPrime = true;
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    isPrime = false;
                }
            }
        return isPrime;
    }
}
