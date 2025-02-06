package Functions;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (even(num)){
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }
    static boolean even(int num){
       return num % 2 == 0;
    }
}
