package KunalKushwaha.Recursion;

public class L1342 {
    public static void main(String[] args) {
        System.out.println(steps(14));
    }
    public static int steps(int num){
        return helper(num,0);
    }
    public static int helper(int num, int steps){
        if(num ==0){
            return steps;
        }
        if(num % 2 ==0){
            return helper(num /2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
