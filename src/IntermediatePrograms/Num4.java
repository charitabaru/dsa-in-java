package IntermediatePrograms;

import java.util.Scanner;

// Calculate Discount Of Product

public class Num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the MRP of the product : ");
        double price = sc.nextDouble();
        System.out.print("Enter the Discount Rate : ");
        double discount = sc.nextDouble();

        double discountAmount = (discount/100) * (price);
        System.out.printf("Total discount amount : %.2f\n",discountAmount);
        double totalPrice = price - discountAmount;
        System.out.printf("Total Price after Discount : %.2f",totalPrice);
    }
}
