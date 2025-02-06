package IntermediatePrograms;

import java.util.Scanner;

/* Kunaal is allowed to go out with his friends only on the even days of a given month. Write a program to count the
   number of days he can go out in the month of August.
*/

public class Num25 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter how many days are there in August month : ");
        int days = sc.nextInt();
        int count = 0;

        for (int i =1; i<=days ; i++){
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println("The total days charitha allowed to go out is "+ count);
    }
}
