package Pattern;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int line = 1; line <= n; line++) {
            int number = 1;

            for (int i = 1; i <= n - line; i++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= line; j++) {
                System.out.print(number + " ");
                number = number * (line - j) / j;
            }

            System.out.println();
        }

        sc.close();
    }
}
