package Java100;

import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();

        // Using if statements to find the smallest number
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("The smallest number is: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("The smallest number is: " + num2);
        } else {
            System.out.println("The smallest number is: " + num3);
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
