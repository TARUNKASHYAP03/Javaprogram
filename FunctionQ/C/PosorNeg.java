package RD.Function;

import java.util.Scanner;

public class PosorNeg {

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isNegative(double number) {
        return number < 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");

        double number = sc.nextDouble();

        if (isPositive(number)) {
            System.out.println("The entered number is positive.");
        } else if (isNegative(number)) {
            System.out.println("The entered number is negative.");
        } else {
            System.out.println("The entered number is zero.");
        }

        sc.close();
    }

}
