package KunalKushwaha.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1568));
    }
    public static boolean palindrome(int n){
        return n == reverse(n);
    }
    public static int reverse(int n){
        if(n%10 ==n){
            return n;
        }
        int digits = (int)(Math.log10(n))+1;
        return n%10 * (int) Math.pow(10,digits-1)+ reverse(n/10);
    }
}
