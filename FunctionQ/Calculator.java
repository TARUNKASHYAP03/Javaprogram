package RD.Function;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the choice : ");
        while (true) {
            System.out.println("Press 1 for addition : ");
            System.out.println("Press 1 for subtraction : ");
            System.out.println("Press 1 for multiplication : ");
            System.out.println("Press 1 for division : ");
            System.out.println("Press 1 for quit : ");

            System.out.print("Enter the choice : ");

            int choice = sc.nextInt();

            if (choice == 5) {
                break;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter the first number : ");
                double n1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                double n2 = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + sum(n1, n2));
                        break;
                    case 2:
                        System.out.println("Result: " + sub(n1, n2));
                        break;
                    case 3:
                        System.out.println("Result: " + mul(n1, n2));
                        break;
                    case 4:
                        double result = div(n1, n2);
                        if (Double.isNaN(result)) {
                            System.out.println("Cannot divide by zero.");
                        } else {
                            System.out.println("Result: " + result);
                        }
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid option.");
            }
        }
        sc.close();
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double sub(double x, double y) {
        return x - y;
    }

    public static double mul(double x, double y) {
        return x * y;
    }

    public static double div(double x, double y) {
        if (y == 0) {
            return Double.NaN;
        }
        return x / y;
    }

}
