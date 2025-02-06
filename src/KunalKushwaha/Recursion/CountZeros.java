package KunalKushwaha.Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(302000200,0));
    }
    public static int count(int n,int c){
        if(n==0){
            //special case to return the same value to above calls;
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return count(n/10,c+1);
        }
        return count(n/10,c);
    }
}
