package Java100.Seiers;

import java.util.Scanner;

public class SeriesEvaluator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        double result = evaluateSeries(x, terms);
        System.out.println("The result of the series is: " + result);

        scanner.close();
    }

    static double evaluateSeries(double x, int terms) {
        double sum = 0;

        for (int i = 1; i <= terms; i++) {
            // Calculate the power of x for the current term
            double term = Math.pow(x, 2 * i);

            // Alternate addition and subtraction based on the term number
            if (i % 2 == 0) {
                sum -= term;
            } else {
                sum += term;
            }
        }

        return sum;
    }
}
