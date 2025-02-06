package ConditionalAndLoops;

import java.util.Scanner;

public class Number23 {
        public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            int n = sc.nextInt();

            //Factors of a Number

            for (int i = 1; i <= 5 ; i++){
                if (n % i == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
