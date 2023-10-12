package Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= n - i; j++) {
            // System.out.print(" ");
            // }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2; k <= i + 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
