package LeetCode.Easy;

public class L204 {
    public static void main(String[] args) {
        int n =10;
        System.out.println(countPrimes(n));
    }
   static int countPrimes(int n) {
        int count = 0;
        if( n <= 2){
            return 0;
        }

        for(int i = 2; i< n ; i++){
            for(int j = 2; j < i;j++){
                if( i % j != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
