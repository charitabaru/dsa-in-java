package Basic;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp1 = sc.nextInt();
        int temp2 = sc.nextInt();

        int num1 = temp1;
        int num2 = temp2;

        while (temp2 != 0){
          int temp3 = temp2;
          temp2 = temp1 % temp2;
          temp1 = temp3;

        }
        System.out.println(temp2);
        int hcf = temp1;
        int lcm = (num1 * num2)/(hcf);

        System.out.println("LCM of "+ num1 + " & "+ num2 + " is = " + lcm );
        System.out.println("HCF of "+ num1 + " & "+ num2 + " is = " + hcf );
    }
}
