package RD.PatternQ;

import java.util.Scanner;

public class Butterfly {
    public static void print(int n) {
        // up side
        for (int i = 1; i <= n; i++) {
            // star = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space =2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // star =i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // down side
        for (int i = n; i >= 1; i--) {
            // star = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space =2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // star =i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size value :");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
