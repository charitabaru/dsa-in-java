package Methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);

    }
    static void swap(int a, int b){
        int temp = b;
        b=a;
        a=temp;
        System.out.println(a + " " +b);
    }
}
