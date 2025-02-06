package ConditionalAndLoops;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base value : ");
        double base = sc.nextFloat();
        System.out.println("Enter the side value : ");
        double side = sc.nextFloat();

        double height = Math.sqrt(Math.pow(side, 2) - Math.pow(base / 2, 2));
        double areaOfIsoscelesTriangle = (base * height)/2;
        System.out.printf("Area of Triangle : %.2f",areaOfIsoscelesTriangle);
    }

}
