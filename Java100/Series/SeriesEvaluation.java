package Java100.Seiers;

import java.util.Scanner;

public class SeriesEvaluation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms in the series: ");
        int terms = scanner.nextInt();

        double result = evaluateSeries(x, terms);

        System.out.println("Result: " + result);

        scanner.close();
    }

    private static double evaluateSeries(double x, int terms) {
        double result = 0;

        for (int i = 0; i < terms; i++) {
            int power = 2 * i + 1;
            double term = Math.pow(-1, i) * Math.pow(x, power) / factorial(power);
            result += term;
        }

        return result;
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
