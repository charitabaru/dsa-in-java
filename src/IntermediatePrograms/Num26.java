package IntermediatePrograms;

import java.util.Scanner;

/* Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd
   numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero. */

public class Num26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int negSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;

        do {
            System.out.print("Enter the number ( 0 to stop) : ");
            n = sc.nextInt();
            if (n < 0){
                negSum += n;
            } else if (n % 2 == 0) {
                posEvenSum += n;
            } else {
                posOddSum += n;
            }
        }while (n != 0);

        sc.close();

        System.out.println("The sum of negative inputs is: " + negSum);
        System.out.println("The sum of positive even inputs is: " + posEvenSum);
        System.out.println("The sum of positive odd inputs is: " + posOddSum);
    }
}
