package v;

/*

Write a method areEqualByFiveDecimalPlaces with three parameters of type double.
The method should return boolean and it needs to return true if three double numbers are the same up to
five decimal places.Otherwise, return false.

Example

areEqualByFiveDecimalPlaces(1.176231, 1.176232, 1.176233) -> should return true since number are equal up
to 5 decimal places.
areEqualByFiveDecimalPlaces(2.23543, 2.235432, 2.235451) -> should return false since numbers are not equal up
to 5 decimal places.

*/

public class Equal5DecimalsCheck {
    public static void main(String[] args) {
        double a = 1.7345693493;
        double b = 1.7345693874;
        double c = 1.734567183;

        boolean result = areEqualByFiveDecimalPlaces(a, b, c);
        System.out.println(result);
    }

    static boolean areEqualByFiveDecimalPlaces(double a,double b,double c){
        boolean condition = true;

        a = Math.floor(a*100000);
        b = Math.floor(b*100000);
        c = Math.floor(c*100000);

        if (a==b && b==c) {
            return condition;
        }
        else {
            return !condition;
        }

    }
}
