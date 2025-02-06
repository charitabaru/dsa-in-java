package KunalKushwaha.Recursion;

public class BasicHelloWorld {
    public static void main(String[] args) {
       message();
    }
    static void message(){
        System.out.println("hello World");
        message1();
    }
    static void message1(){
        System.out.println("hello World");
        message2();
    }
    static void message2(){
        System.out.println("hello World");
        message3();
    }
    static void message3(){
        System.out.println("hello World");
        message4();
    }
    static void message4(){
        System.out.println("hello World");
    }
}
