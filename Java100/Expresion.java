package Java100;

import java.util.Scanner;

public class Expresion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of n : ");
        double n = sc.nextDouble();

        double y;

        switch ((int) n) {
            case 1:
                y = 1 + x;
                System.out.println("Result " + y);
                break;
            case 2:
                y = 1 + x / n;
                System.out.println("Result " + y);
                break;
            case 3:
                y = 1 + Math.pow(x, n);
                System.out.println("Result " + y);
                break;

            default:
                y = 1 + n * x;
                System.out.println("Result " + y);
                break;
        }

        sc.close();
    }
}
