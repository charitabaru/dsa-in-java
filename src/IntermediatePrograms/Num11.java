package IntermediatePrograms;

import java.util.Scanner;

//calculate the Compound Interest

public class Num11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Annual Interest Rate (in %): ");
        double rate = sc.nextDouble();

        char rateperiod;
        do{
            System.out.print("Enter if the rate period iw for years, months or days (y/m/d) : ");
            rateperiod = sc.next().trim().charAt(0);
        }while (rateperiod != 'y' && rateperiod !='m' && rateperiod != 'd');

        if (rateperiod == 'm'){
            rate *= 12;
        } else if (rateperiod == 'd') {
            rate *= 365;
        }

        System.out.print("Enter the Time (in years): ");
        int time = sc.nextInt();

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

        System.out.print("Enter the Number of times interest is compounded per year: ");
        int numberOfTimesCompounded = sc.nextInt();

        double rateInDecimal = rate / 100;

        // compound interest using the formula A = P(1 + r/n)^(nt)
        double amount = principal * Math.pow((1 + (rateInDecimal / numberOfTimesCompounded)), numberOfTimesCompounded * time);

        // Calculate compound interest
        double compoundInterest = amount - principal;

        // Print the results
        System.out.printf("Compound Interest: %.2f\n", compoundInterest);
        System.out.printf("Total Amount after Interest: %.2f\n", amount);

    }
}
