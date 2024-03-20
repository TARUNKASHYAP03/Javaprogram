package JavaProgram.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static int stepCount = 0;

    static void printStatement(int n, String src, String helper, String dest) {
        if (n == 1) {
            stepCount++;
            System.out.println("Step " + stepCount + ": Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Transfer top n-1 disks from src to helper using dest as "helper"
        printStatement(n - 1, src, dest, helper);

        // Transfer nth disk from src to dest
        stepCount++;
        System.out.println("Step " + stepCount + ": Transfer disk " + n + " from " + src + " to " + dest);

        // Transfer n-1 disks from helper to dest using src as "helper"
        printStatement(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks : ");
        int n = sc.nextInt();
        printStatement(n, "A", "B", "C");
        System.out.println("Total steps: " + stepCount);
        sc.close();
    }
}
