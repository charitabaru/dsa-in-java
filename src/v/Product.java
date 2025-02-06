package v;

/*

Write a method hasEqualProduct with 3 parameters of type int.

The method should return boolean and it needs to return true
if the product of the first and second parameter is equal to the third parameter. Otherwise, return false.

Example

Input :

2 3 6

Output :

True

Explanation:

Since 2*3 is equal to 6, hence return true.

*/

public class Product {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 9;

        boolean result = hasEqualProduct(a, b, c);
        System.out.println(result);
    }

    static boolean hasEqualProduct(int a, int b, int c){
        boolean condition = true;

        if (c == a*b) {
            return condition;
        }
        else{
            return !condition;
        }
    }
}
