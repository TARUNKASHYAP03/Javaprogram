package Java100.Seiers;

import java.util.Scanner;

public class SeriesEvaluate4 {
    public static int calculate(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term of value calculate sum : ");// -1^3+3^3-5^3+......
        int n = sc.nextInt();

        System.out.println("Series sum : " + calculate(n));
        sc.close();
    }
}
