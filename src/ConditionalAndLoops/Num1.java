package ConditionalAndLoops;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pieValue = Math.PI;

        double areaOfCircle = pieValue * (Math.pow(radius,2));
        System.out.printf(" Area of Circle is : %.2f ", areaOfCircle);
    }
}
