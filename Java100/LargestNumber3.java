package Java100;

import java.util.Scanner;

public class LargestNumber3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        // Using conditional operator to find the largest number
        double largestNumber = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out
                .println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largestNumber);

        scanner.close();
    }
}
