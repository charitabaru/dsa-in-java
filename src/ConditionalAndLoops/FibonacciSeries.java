package ConditionalAndLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        for (int i=2; i<=n; i++){
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }

}
