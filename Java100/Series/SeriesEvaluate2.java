package Java100.Seiers;

import java.util.Scanner;

public class SeriesEvaluate2 {
    public static void calculate(int n) {
        int sum = 0;// sum=((1)^n)*((2*n+1)^3s)

        for (int i = 0; i <= n; i++) {
            // Calculate the cube of the current odd number
            int oddNumber = 2 * i + 1;
            int cube = (int) Math.pow(oddNumber, 3);

            // Alternate addition and subtraction based on the term number
            if (i % 2 == 0) {
                sum += cube;
            } else {
                sum -= cube;
            }
        }
        System.out.println("Series Sum : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term of value calculate sum : ");// -1^3+3^3-5^3+......
        int n = sc.nextInt();
        calculate(n);
        sc.close();
    }
}
