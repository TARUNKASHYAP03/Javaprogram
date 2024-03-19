package JavaProgram.Recursion;

import java.util.Scanner;

public class Numbertostring {

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    static void printString(int n) {
        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        printString(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any number : ");
        int n = sc.nextInt();
        printString(n);
        sc.close();
    }
}