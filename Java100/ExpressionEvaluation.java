package Java100;

import java.util.Scanner;

public class ExpressionEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of n : ");
        double n = sc.nextDouble();

        double result = Math.pow((x + 5), n) - Math.sqrt((3 * x) / (2 * n));

        System.out.println("Expresion evaluate = " + result);

        sc.close();
    }
}
