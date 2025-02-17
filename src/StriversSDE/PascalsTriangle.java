package StriversSDE;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(Ncr(4,2));
        Nth(6);
    }
    public static int Ncr(int n ,int r){
        int res =1;
        for(int i =0;i<r;i++){
            res = res*(n-i);
            res /= i+1;
        }
        return res;
    }
    public static void Nth(int n){
        int ans =1;
        System.out.print(ans + " ");
        for(int i =1;i<n;i++){
            ans = ans*(n-i);
            ans /= i;
            System.out.print(ans + " ");
        }
    }

}
