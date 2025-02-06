package IntermediatePrograms;

import java.util.Scanner;

//Calculate Average Of N Numbers

public class Num3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i =1; i<=n; i++){
            sum += i;
        }

        double average = (double) sum /n;

        System.out.println("The average of N numbers : "+ average);
    }
}
