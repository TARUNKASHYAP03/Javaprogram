package JavaProgram.Recursion;

import java.util.Scanner;

public class Tiles {
    static int tileProblem(int n) {// n (2*n) is floor size
        // Base condition

        if (n == 0 || n == 1) {
            return 1;
        }

        // work
        // vertical choice
        int fn1 = tileProblem(n - 1);

        // Horizontal choice
        int fn2 = tileProblem(n - 2);

        int totways = fn1 + fn2;

        return totways;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the floor size : ");
        int n = sc.nextInt();
        System.out.println("Total ways tiles sets in floor : " + tileProblem(n));
        sc.close();
    }
}
