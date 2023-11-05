package RD.Function;

import java.util.Scanner;

public class SumofN {
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n) to calculate the sum of 1+2+3+...+n: ");
        int n = scanner.nextInt();

        int result = calculateSum(n);

        System.out.println("The sum of 1+2+3+...+" + n + " is: " + result);

        scanner.close();
    }
}
