package IntermediatePrograms;

import java.util.Scanner;

// Calculate the CGPA

public class Num10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total Subjects : ");
        int totalSubjects = sc.nextInt();

        double sumCredits = 0;
        double totalGradePoints = -1;

        for (int i =1; i <= totalSubjects; i++){
            System.out.print("Enter the " + i +"st subject GradePoint : ");
            double grade = sc.nextDouble();
            System.out.print("Enter the " + i +"st subject Credit Hour : ");
            double creditHour = sc.nextDouble();

            totalGradePoints += grade * creditHour;
            sumCredits += creditHour;
        }

        double cgpa = totalGradePoints / sumCredits;
        System.out.printf(" CGPA = %.2f", cgpa);


    }
}
