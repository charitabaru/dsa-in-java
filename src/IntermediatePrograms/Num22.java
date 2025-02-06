package IntermediatePrograms;

import java.util.Scanner;

// check for Perfect Number.

public class Num22 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i =1; i<n; i++){
            if (n%i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println("The given number is perfect number");
        }else {
            System.out.println("not a perfect number.");
        }
    }
}
