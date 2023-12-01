package Java100;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();

        double rootexpre = (b * b - 4 * a * c);

        if (rootexpre >= 0) {

            double firstexpre = (-b + Math.sqrt(rootexpre)) / 2 * a;
            double secondexpre = (-b + Math.sqrt(rootexpre)) / 2 * a;

            System.out.println("First root of equation " + firstexpre);
            System.out.println("Second root of equation " + secondexpre);
        } else {
            System.out.println("Roots are complex numbers.");
        }

        sc.close();
    }
}