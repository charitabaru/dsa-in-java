package KunalKushwaha.Recursion;

public class Nto1And1toN {
    // 5,4,3,2,1,1,2,3,4,5
    public static void main(String[] args) {
        printBoth(5);
    }
    public static void printBoth(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
