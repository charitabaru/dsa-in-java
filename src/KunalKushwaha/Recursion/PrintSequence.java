package KunalKushwaha.Recursion;

public class PrintSequence {
    //Sample Input 1 —- 1
    //Sample Output 1 —-1 1 1
    //
    //Sample Input 2 —- 2
    //Sample Output 2 —- 2 1 1 1 2 1 1 1 2
    //
    //Sample Input 2 —- 3
    //Sample Output 3 —- 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
    //
    //Figure out the pattern and solve it using a recursive function to achieve the above for any positive number n.
    public static void main(String[] args) {
        printSequence(2);
    }
    public static void printSequence(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        printSequence(n-1);
        System.out.print(n+" ");
        printSequence(n-1);
        System.out.print(n+" ");
    }
}
