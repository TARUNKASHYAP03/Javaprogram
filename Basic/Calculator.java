package RD;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.print("Enter dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                case 5:
                    System.out.println("Exiting the calculator.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
