package OOPS;

public class WrapperClasses {

    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        // even this doesn't work because the Integer by default has a final keyword which
        // doesn't get reinitialized or changed for primitives type objects.
        swap(a, b);

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;

        // non primitives are mutable.
        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it.
//        kunal = new A("new object");

        A obj = new A("Rnadvsjhv");

        System.out.println(obj);

//        A obj;
//
//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random name");
//        }

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    /*
    This will work if the print statement is given inside the function
    here the values of a & b are changing only inside the swap func but in main there are remaining same
    because the values are passed by value primitives are passed by value not by reference and in java
    it doesn't work like the

    public static void main(String[] args) {
        int a =10;
        int b =20;

        swap(a,b);
        System.out.println(a + " " + b);
    }
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

    }
    */

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
