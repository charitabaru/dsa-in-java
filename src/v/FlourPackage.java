package v;

import java.util.Scanner;

/*

Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.

The parameter bigCount represents the count of big flour bags (5 kilos each).

The parameter smallCount represents the count of small flour bags (1 kilo each).

The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.

The method should return true if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount.

For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag
is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true
because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.

If any of the parameters are negative, return false.

EXAMPLE INPUT/OUTPUT:

canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos,
and we have 1 bag left which is ok as mentioned above.
canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2
(small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
canPack (-3, 2, 12); should return false since bigCount is negative.

*/

public class FlourPackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Big Packets Count ( Each 5kgs ) : ");
        int bigCount = sc.nextInt();
        System.out.print("Enter the Small Packets Count ( Each 1kg ) : ");
        int smallCount = sc.nextInt();
        System.out.print("Enter the Total Goal package Required : ");
        int goal = sc.nextInt();

        boolean result = canPack(bigCount,smallCount,goal);
        System.out.println(result);
    }

    static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int maxBigBagsToUse = Math.min(goal / 5, bigCount);
        int remainingGoal = goal - (maxBigBagsToUse * 5);

        return remainingGoal <= smallCount;
    }

//    static boolean canPack(int bigCount, int smallCount, int goal){
//        boolean value = false;
//        if(bigCount > 0 && smallCount > 0){
//            int bigPackage = bigCount * 5;
//            int sum = bigPackage + smallCount;
//
//            if (sum == goal){
//                value = true;
//            } else if (sum > goal) {
//                int excessNeed = sum - goal;
//                int required = bigPackage + (smallCount - excessNeed);
//                if (required == goal){
//                    value = true;
//                }
//            }
//        }
//        return value;
//    }
}
