package ConditionalAndLoops;

import java.util.Scanner;

public class Number25 {
    public static void main(String[] args) {
        int largest = 0;
        int number;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the number : ");
            number = sc.nextInt();
            if(number > largest){
                largest = number;
            }
        }while (number != 0);

        System.out.println("Largest number among all = " + largest);
    }
}
