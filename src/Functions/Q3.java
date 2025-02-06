package Functions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        if (age < 0){
            System.out.println("Enter valid input");
        }
        if (age >0){
            if (vote(age)){
                System.out.println("Eligible to vote.");
            }else {
                System.out.println("Not Eligible to vote.");
            }
        }
    }
    static boolean vote(int age){
        return age >= 18;
    }
}
