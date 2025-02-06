package Functions;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println(product(num1,num2));
    }
    static float product(float num1,float num2){
        return num1 * num2;
    }
}
