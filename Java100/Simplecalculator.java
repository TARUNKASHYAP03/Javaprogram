package Java100;

import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");

        System.out.print("Enter the number (1 to 4) which calculate you : ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.print("Enter the first number : ");
                double a = sc.nextInt();
                System.out.print("Enter the second number : ");
                double b = sc.nextInt();

                double result = a + b;
                System.out.println("Addition is " + result);

                break;
            case 2:
                System.out.print("Enter the first number : ");
                a = sc.nextInt();
                System.out.print("Enter the second number : ");
                b = sc.nextInt();

                result = a - b;
                System.out.println("Subtraction is " + result);
                break;
            case 3:
                System.out.print("Enter the first number : ");
                a = sc.nextInt();
                System.out.print("Enter the second number : ");
                b = sc.nextInt();

                result = a * b;
                System.out.println("Multiplication is " + result);
                break;
            case 4:
                System.out.print("Enter the first number : ");
                a = sc.nextInt();
                System.out.print("Enter the second number : ");
                b = sc.nextInt();

                result = a / b;
                System.out.println("Addition is " + result);

            default:
                System.out.print("You enter the worng number ");
                break;
        }

        sc.close();
    }
}
