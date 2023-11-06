package RD.Function;

import java.util.Scanner;

public class TriangleType {

    public static boolean isEquilateral(double side1, double side2, double side3) {
        return (side1 == side2) && (side2 == side3);
    }

    public static boolean isIsosceles(double side1, double side2, double side3) {
        return (side1 == side2) || (side1 == side3) || (side2 == side3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lengths of three sides of the triangle:");

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        if (isEquilateral(side1, side2, side3)) {
            System.out.println("Equilateral Triangle");
        } else if (isIsosceles(side1, side2, side3)) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

        sc.close();
    }

}
