package Java100;

import java.util.Scanner;

public class SwapNo3 {

    public static void Swaping(int a, int b) {
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swaping " + a);
        System.out.print("After swaping " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();

        Swaping(a, b);
        sc.close();
    }
}
