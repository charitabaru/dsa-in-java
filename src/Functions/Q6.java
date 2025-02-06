package Functions;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pieValue = Math.PI;
        double areaOfCircle = areaOfCircle(radius,pieValue);
        System.out.printf(" Area of Circle is : %.2f\n ", areaOfCircle);
        double circumference = circumferenceOfCircle(radius,pieValue);
        System.out.printf("Circumference of Circle is : %.2f ", circumference);
    }
    static double areaOfCircle(int radius, double pieValue){
        return pieValue * (Math.pow(radius,2));
    }
    static double  circumferenceOfCircle(int radius,double pie){
        return 2*pie*radius;
    }
}
