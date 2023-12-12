package Java100.Pattern;

import java.util.Scanner;

public class Pyramidnum {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print decreasing numbers excluding the first number
            num -= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(num + " ");
                num--;
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n = sc.nextInt();

        pattern(n);

        sc.close();
    }
}
