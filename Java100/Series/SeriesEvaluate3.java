package Java100.Seiers;

import java.util.Scanner;

public class SeriesEvaluate3 {
    public static void calculate(int n) {
        double sum = (double) ((2 * n + 1) * (n + 1) * (2 * n * n + 2 * n - 1)) / 15;

        System.out.println("Series sum : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term of value calculate sum : ");// -1^3+3^3-5^3+......
        int n = sc.nextInt();
        calculate(n);
        sc.close();
    }
}
