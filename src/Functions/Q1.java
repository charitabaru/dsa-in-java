package Functions;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int maximum = maximum(num1,num2,num3);
        int minimum = minimum(num1,num2,num3);
        System.out.println("Maximum number = "+ maximum);
        System.out.println("Minimum Number = " + minimum);
    }
    static int maximum(int num1,int num2,int num3){
        int max = num1;
        if (num2 > max){
            max = num2;
        }if(num3 > max) {
            max = num3;
        }
        return max;
    }
    static int minimum(int num1,int num2, int num3){
        int min = num1;
        if (num2 < min){
            min = num2;
        } if (num3 < min) {
            min = num3;
        }
        return min;
    }
}
