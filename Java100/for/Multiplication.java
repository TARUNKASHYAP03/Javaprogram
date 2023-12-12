package Java100.For;

import java.util.*;

public class Multiplication {
    public static void table(int n) {
        System.out.println("Multiplication Table up to " + n + ":");
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= n; ++j) {
                System.out.printf("%4d", i * j); // Adjust the width based on the maximum result
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        table(n);

        sc.close();
    }
}
