package JavaProgram.PatternQ;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int numRows = scanner.nextInt();

        scanner.close();

        printNumberPyramid(numRows);
    }

    private static void printNumberPyramid(int numRows) {
        int currentValue = 1;

        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(currentValue++ + " ");
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}
