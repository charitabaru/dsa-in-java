package ConditionalAndLoops;

import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int count = 0;

        int number = 1256777890;
        while(number>0){
            int digit = number % 10;
            if(digit == n){
                count++;
            }
            number /= 10;
        }
        System.out.println(count);
    }

}
