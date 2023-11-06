package RD.Function;

import java.util.Scanner;

public class Sum {
    public static int calculateSumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = calculateSumOfDigits(num);

        System.out.println("Sum of the digits of " + num + " is: " + sum);

        scanner.close();
    }
}
