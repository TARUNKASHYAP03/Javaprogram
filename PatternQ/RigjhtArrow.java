package Pattern;

import java.util.Scanner;

public class RigjhtArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size value : ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - (2 * i)); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
