package JavaProgram.Recursion;

import java.util.Scanner;

public class LtoRto {
    public static void RTL(int n) {
        if (n < 0) {
            System.out.print("-");
            n = Math.abs(n);
        }

        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        RTL(n);
        sc.close();
    }
}
