package RD.Function;

import java.util.Scanner;

public class SumofN2 {
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n) to calculate the sum of 1^2 + 2^2 + 3^2 + ... + n^2: ");
        int n = scanner.nextInt();

        int result = calculateSum(n);

        System.out.println("The sum of 1^2 + 2^2 + 3^2 + ... + " + n + "^2 is: " + result);

        scanner.close();
    }
}
