package ConditionalAndLoops;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();

        double areaOfTriangle =  (double) (base * height) / 2;

        System.out.printf("Area of Triangle : %.2f",areaOfTriangle);


    }
}
