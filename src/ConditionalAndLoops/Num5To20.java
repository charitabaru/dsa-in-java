package ConditionalAndLoops;
import java.util.Scanner;

public class Num5To20 {
        // Area calculations
        public static double areaOfParallelogram(double base, double height) {
            return base * height;
        }

        public static double areaOfRhombus(double diagonal1, double diagonal2) {
            return (diagonal1 * diagonal2) / 2;
        }

        public static double areaOfEquilateralTriangle(double side) {
            return (Math.sqrt(3) / 4) * Math.pow(side, 2);
        }

        // Perimeter calculations
        public static double perimeterOfCircle(double radius) {
            return 2 * Math.PI * radius;
        }

        public static double perimeterOfEquilateralTriangle(double side) {
            return 3 * side;
        }

        public static double perimeterOfParallelogram(double sideA, double sideB) {
            return 2 * (sideA + sideB);
        }

        public static double perimeterOfRectangle(double length, double width) {
            return 2 * (length + width);
        }

        public static double perimeterOfSquare(double side) {
            return 4 * side;
        }

        public static double perimeterOfRhombus(double side) {
            return 4 * side;
        }

        // Volume calculations
        public static double volumeOfCone(double radius, double height) {
            return (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
        }

        public static double volumeOfPrism(double baseArea, double height) {
            return baseArea * height;
        }

        public static double volumeOfCylinder(double radius, double height) {
            return Math.PI * Math.pow(radius, 2) * height;
        }

        public static double volumeOfSphere(double radius) {
            return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        }

        public static double volumeOfPyramid(double baseArea, double height) {
            return (1.0 / 3) * baseArea * height;
        }

        // Surface area calculations
        public static double curvedSurfaceAreaOfCylinder(double radius, double height) {
            return 2 * Math.PI * radius * height;
        }

        public static double totalSurfaceAreaOfCube(double side) {
            return 6 * Math.pow(side, 2);
        }

        public static void main(String[] args)   {
            Scanner sc = new Scanner(System.in);

            // Area of Parallelogram
            System.out.print("Enter the base and height of the parallelogram: ");
            double baseP = sc.nextDouble();
            double heightP = sc.nextDouble();
            System.out.printf("Area of Parallelogram: %.2f\n", areaOfParallelogram(baseP, heightP));

            // Area of Rhombus
            System.out.print("Enter the diagonals of the rhombus: ");
            double diag1 = sc.nextDouble();
            double diag2 = sc.nextDouble();
            System.out.printf("Area of Rhombus: %.2f\n", areaOfRhombus(diag1, diag2));

            // Area of Equilateral Triangle
            System.out.print("Enter the side length of the equilateral triangle: ");
            double sideEq = sc.nextDouble();
            System.out.printf("Area of Equilateral Triangle: %.2f\n", areaOfEquilateralTriangle(sideEq));

            // Perimeter of Circle
            System.out.print("Enter the radius of the circle: ");
            double radiusC = sc.nextDouble();
            System.out.printf("Perimeter of Circle: %.2f\n", perimeterOfCircle(radiusC));

            // Perimeter of Equilateral Triangle
            System.out.printf("Perimeter of Equilateral Triangle: %.2f\n", perimeterOfEquilateralTriangle(sideEq));

            // Perimeter of Parallelogram
            System.out.print("Enter the lengths of the two sides of the parallelogram: ");
            double sideA = sc.nextDouble();
            double sideB = sc.nextDouble();
            System.out.printf("Perimeter of Parallelogram: %.2f\n", perimeterOfParallelogram(sideA, sideB));

            // Perimeter of Rectangle
            System.out.print("Enter the length and width of the rectangle: ");
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            System.out.printf("Perimeter of Rectangle: %.2f\n", perimeterOfRectangle(length, width));

            // Perimeter of Square
            System.out.print("Enter the side length of the square: ");
            double sideS = sc.nextDouble();
            System.out.printf("Perimeter of Square: %.2f\n", perimeterOfSquare(sideS));

            // Perimeter of Rhombus
            System.out.print("Enter the side length of the rhombus: ");
            double sideR = sc.nextDouble();
            System.out.printf("Perimeter of Rhombus: %.2f\n", perimeterOfRhombus(sideR));

            // Volume of Cone
            System.out.print("Enter the radius and height of the cone: ");
            double radiusCone = sc.nextDouble();
            double heightCone = sc.nextDouble();
            System.out.printf("Volume of Cone: %.2f\n", volumeOfCone(radiusCone, heightCone));

            // Volume of Prism
            System.out.print("Enter the base area and height of the prism: ");
            double baseArea = sc.nextDouble();
            double heightPrism = sc.nextDouble();
            System.out.printf("Volume of Prism: %.2f\n", volumeOfPrism(baseArea, heightPrism));

            // Volume of Cylinder
            System.out.print("Enter the radius and height of the cylinder: ");
            double radiusCyl = sc.nextDouble();
            double heightCyl = sc.nextDouble();
            System.out.printf("Volume of Cylinder: %.2f\n", volumeOfCylinder(radiusCyl, heightCyl));

            // Volume of Sphere
            System.out.print("Enter the radius of the sphere: ");
            double radiusSph = sc.nextDouble();
            System.out.printf("Volume of Sphere: %.2f\n", volumeOfSphere(radiusSph));

            // Volume of Pyramid
            System.out.print("Enter the base area and height of the pyramid: ");
            double baseAreaPyr = sc.nextDouble();
            double heightPyr = sc.nextDouble();
            System.out.printf("Volume of Pyramid: %.2f\n", volumeOfPyramid(baseAreaPyr, heightPyr));

            // Curved Surface Area of Cylinder
            System.out.print("Enter the radius and height of the cylinder for curved surface area: ");
            double radiusCylCurved = sc.nextDouble();
            double heightCylCurved = sc.nextDouble();
            System.out.printf("Curved Surface Area of Cylinder: %.2f\n", curvedSurfaceAreaOfCylinder(radiusCylCurved, heightCylCurved));

            // Total Surface Area of Cube
            System.out.print("Enter the side length of the cube: ");
            double sideCube = sc.nextDouble();
            System.out.printf("Total Surface Area of Cube: %.2f\n", totalSurfaceAreaOfCube(sideCube));

            sc.close();
        }
    }

