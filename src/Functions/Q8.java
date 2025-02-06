package Functions;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        String grade = calculateGrade(marks);
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }

    public static String calculateGrade(int marks) {
        // Input validation
        if (marks < 0 || marks > 100) {
            return "Invalid marks. Please enter marks between 0 and 100.";
        }

        // Grade calculation using if-else
        if (marks >= 91 && marks <= 100) {
            return "AA";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        } else if (marks >= 71 && marks <= 80) {
            return "BB";
        } else if (marks >= 61 && marks <= 70) {
            return "BC";
        } else if (marks >= 51 && marks <= 60) {
            return "CD";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else {
            return "Fail";
        }
    }
}
