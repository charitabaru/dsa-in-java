package ConditionalAndLoops;

import java.util.Scanner;

public class Number24 {

    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("enter a number ( 0 to stop) : ");
            n = sc.nextInt();
            sum += n;
        }
        while (n != 0);

        System.out.println("the sum is : " + sum);
    }
}
