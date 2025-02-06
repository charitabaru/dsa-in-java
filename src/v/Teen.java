package v;

/*

Write a method named hasNotTeen with 3 parameters of type int.

We’ll say that a number is  “teen” if it is in the range 13..19 inclusive, otherwise it is not teen.
Given 3 int values, return true if none of them are teen, otherwise return false..

Example

Sample Input 1 :

13 12 20

Sample Output 1:

False

Explanation:

Since 13 is a teen number, hence false is returned.



Sample Input 2:

9 29 21

Sample output 2:

True

Explanation:

Since numbers 9,29,21 are not in range 13-19, hence true is returned.

*/

public class Teen {
    public static void main(String[] args) {
        System.out.println(isNotTeen(9, 29, 21));

        System.out.println(isNotTeen(13,20,18));
    }

    static boolean isTeen(int num) {
        if (num >= 13 && num <= 19) {
            return false;
        } else {
            return true;
        }
    }

    static boolean isNotTeen(int a, int b, int c) {
        return isTeen(a) && isTeen(b) && isTeen(c);
    }

}
