package IntermediatePrograms;

import java.util.Scanner;

// permutations and combinations

public class Num15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n:");
        int n = sc.nextInt();
        System.out.print("Enter value for r:");
        int r = sc.nextInt();

        long permutations = nPcr(n,r);
        long combinations = nCr(n,r);

        System.out.println("nPr (Permutations): " + permutations);
        System.out.println("nCr (Combinations): " + combinations);

    }
    static long factorial(int number){
        long product = 1;
        for (int i =2; i<=number; i++){
            product *= i;
        }
        return product;
    }
    static long nPcr(int n,int r){
        return factorial(n) / factorial(n-r);
    }
    static long nCr(int n,int r){
        return  factorial(n) / ( factorial(r) * factorial(n-r));
    }

}
