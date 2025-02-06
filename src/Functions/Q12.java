package Functions;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get three numbers from user
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Check if they form Pythagorean triplet
        if((a*a + b*b) == c*c) {
            System.out.println("Yes, it's a Pythagorean triplet");
        } else {
            System.out.println("No, it's not a Pythagorean triplet");
        }

        sc.close();
    }
}

