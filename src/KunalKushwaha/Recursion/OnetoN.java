package KunalKushwaha.Recursion;

public class OnetoN {
    public static void main(String[] args) {
        concept(5);
    }
    public static void print(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
// when given input as 5 at starting then i want to print from 1-n if n=5 i want 1,2,3,4,5 to be printed i.e,
// When 5 is called it will print at last once 4,3,21, is being called followed by all numbers as same 4 wits for 3,2,1
    public static void PrintRev(int n){
        if(n==0){
            return;
        }
        PrintRev(n-1);
        System.out.println(n);
    }

    //concept
    public static void concept(int n) {
        if (n == 0) { // Change base case to 0
            return;
        }
        concept(--n); // Pre-decrement before recursion
        System.out.println(n + 1); // Adjust the print to correct the shifted values
    }



}
