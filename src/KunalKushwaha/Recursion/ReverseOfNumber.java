package KunalKushwaha.Recursion;

public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1824));
    }
    public static int reverse(int n){
        if(n%10 ==n){
            return n;
        }
        int digits = (int)(Math.log10(n))+1;
        return n%10 * (int) Math.pow(10,digits-1)+ reverse(n/10);
    }
}
