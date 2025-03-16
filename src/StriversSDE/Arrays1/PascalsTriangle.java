package StriversSDE.Arrays1;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("C(4,2) = " + nCr(4,2));
        printNthRow(5); // Prints the 6th row (0-based indexing)
    }

    // Function to calculate nCr (binomial coefficient)
    public static int nCr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res /= (i + 1);
        }
        return res;
    }

    // Function to print the Nth row of Pascal’s Triangle (0-based indexing)
    public static void printNthRow(int n) {
        int ans = 1;
        System.out.print("Nth Row of Pascal’s Triangle: ");
        System.out.print(ans + " ");  // First element is always 1

        for (int i = 1; i <= n; i++) {
            ans = ans * (n - i + 1);
            ans /= i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
}
