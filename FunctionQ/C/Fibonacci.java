package RD.Function;

import java.util.Scanner;

public class Fibonacci {
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series (First " + n + " numbers):");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci series terms to print: ");
        int n = scanner.nextInt();

        printFibonacciSeries(n);

        scanner.close();
    }
}
