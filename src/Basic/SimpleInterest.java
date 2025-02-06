package Basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle Amount: ");
        float principle = sc.nextFloat();
        System.out.print("Enter the Rate of interest: ");
        float rate = sc.nextFloat();

        char rateperiod;
        do{
            System.out.print("Enter if the rate period is for years, months or days (y/m/d) : ");
            rateperiod = sc.next().trim().charAt(0);
        }while (rateperiod != 'y' && rateperiod !='m' && rateperiod != 'd');

        if (rateperiod == 'm'){
            rate *= 12;
        } else if (rateperiod == 'd') {
            rate *= 365;
        }

        System.out.print("Enter the Time period: ");
        float time = sc.nextInt();

        char timeUnit;
        do{
            System.out.print("Enter if the time period is for year, months or days (y/m/d) : ");
            timeUnit = sc.next().trim().charAt(0);
        }while (timeUnit != 'y' && timeUnit !='m' && timeUnit!= 'd');


        if (timeUnit == 'm'){
            time /= 12;
        } else if (timeUnit == 'd') {
            time /= 365;
        }

        float simpleInterest = (principle * rate * time)/100;

        System.out.printf("Simple Interest: %.2f",simpleInterest);
    }
}
