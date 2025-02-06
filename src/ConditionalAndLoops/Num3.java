package ConditionalAndLoops;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();

        double areaOfRectangle = length * breadth;
        System.out.printf("Area of Rectangle : %.2f",areaOfRectangle);
    }
}
