package JavaProgram.Recursion;

import java.util.Scanner;

public class Power {
    static int calPowOfXn(int n, int pow) {
        if (pow == 0) {
            return 1;
        }

        int halfpower = calPowOfXn(n, pow / 2);

        int halfPowersq = halfpower * halfpower;

        // power is odd

        if (pow % 2 != 0) {
            halfPowersq = n * halfPowersq;
        }

        return halfPowersq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of power : ");
        int pow = sc.nextInt();
        System.out.println(n + " power " + pow + " : " + calPowOfXn(n, pow));
        sc.close();
    }
}
