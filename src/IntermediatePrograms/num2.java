package IntermediatePrograms;

import java.util.Scanner;

// Electricity Bill

public class num2 {
    static double ElectricityBill(double watt,int time, double ratePerKwh,double fixedCharges,double tax ){
        double kwh = (watt * time)/1000;
        double billNoTax = (kwh * ratePerKwh)+ fixedCharges;
        tax = (tax/100) * billNoTax;
        return  billNoTax + tax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of watt consumed : ");
        double watt = sc.nextDouble();
        System.out.print("Enter the amount of time consumed  : ");
        int time = sc.nextInt();

        char timeUnit;
        do{
            System.out.print("Enter if the time period is for year, months or days (h/m/s) : ");
            timeUnit = sc.next().trim().charAt(0);
        }while (timeUnit != 'h' && timeUnit !='m' && timeUnit!= 's');

        if (timeUnit == 'm'){
            time /= 60;
        } else if (timeUnit == 's') {
            time /= 3600;
        }

        System.out.print("Enter the Rate per KWh : ");
        double ratePerKwh = sc.nextDouble();
        System.out.println("Enter the Fixed Charges : ");
        double fixedCharges = sc.nextDouble();
        System.out.print("Enter the tax charges for your locality (in percentage): ");
        double tax = sc.nextDouble();

        double bill = ElectricityBill(watt,time,ratePerKwh,fixedCharges,tax);

        System.out.print("The total Electricity bill : " + bill);
    }

}
