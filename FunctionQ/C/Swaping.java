package RD.Function;

import java.util.Scanner;

// Swaping without using thrid number
public class Swaping {
    public static void swap1(int a, int b) {
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swap first number :" + a);
        System.out.print("After swap second number :" + b);
        // return a;
    }

    // public static int swap2(int a, int b) {
    // a = a + b;
    // b = a - b;
    // return b;
    // }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();

        swap1(a, b);

        // int first = swap1(a, b);
        // int second = swap2(a, b);
        // System.out.println("After swap first number :" + first);
        // System.out.print("After swap second number :" + second);
        sc.close();
    }
}
