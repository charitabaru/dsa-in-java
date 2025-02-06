package KunalKushwaha.Recursion;

public class SumOfN{
    public static void main(String[] args) {
        int ans = sumOfN(5);
        System.out.println(ans);
    }
    public static int sumOfN(int n ){
        if(n==1){
            return 1;
        }
        return n + sumOfN(n-1);
    }
}
