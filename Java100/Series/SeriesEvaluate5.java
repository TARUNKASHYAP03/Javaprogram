package Java100.Seiers;

import java.util.Scanner;

public class SeriesEvaluate5 {
    public static int calculate(int n) {
        int sum = 0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                int b = 2 * i;
                int p = 2 * i - 1;
                int cal = (int) Math.pow(b, p);
                sum += cal;
            }
        } else {
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term of value calculate sum : ");// 2^1+4^3+6^5+8^7+.....
        int n = sc.nextInt();

        int seriesSum = calculate(n);
        if (seriesSum != -1) {
            System.out.println("Series sum: " + seriesSum);
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        sc.close();
    }
}
