package Java100.Pattern;

import java.util.Scanner;

public class Rightalpha1 {
    public static int triangle(int n) {
        char alpha = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alpha + " ");
                alpha++;
            }
            System.out.println();
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n = sc.nextInt();
        triangle(n);
        sc.close();
    }
}
