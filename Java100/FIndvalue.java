package Java100;

import java.util.Scanner;

public class FIndvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n : ");
        double n = sc.nextDouble();

        if (n == 1) {
            int y = 1 + x;
            System.out.println("Result of Expression = " + y);
        } else if (n == 2) {
            double y = 1 + x / n;
            System.out.println("Result of Expression = " + y);
        } else if (n == 3) {
            double y = 1 + Math.pow(x, n);
            System.out.println("Result of Expression = " + y);
        } else {
            double y = 1 + n * x;
            System.out.println("Result of Expression = " + y);
        }

        sc.close();
    }
}
