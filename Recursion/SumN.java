package JavaProgram.Recursion;

import java.util.Scanner;

public class SumN {
    public static int sum(int k) {
        if (k == 1) {
            return 1;
        }

        int sum1 = k + sum(k - 1);
        return sum1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last value : ");
        int k = sc.nextInt();
        System.out.println("Sum of first " + k + " is " + sum(k));
        sc.close();
    }
}
