package Java100;

import java.util.Scanner;

public class Swap {

    public static void AfterSwap(int f, int s) {
        int temp;
        temp = f;
        f = s;
        s = temp;

        System.out.println("After swap first number :" + f);
        System.out.print("After swap second number :" + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int f = sc.nextInt();
        System.out.print("Enter the second number :");
        int s = sc.nextInt();

        AfterSwap(f, s);
        sc.close();
    }
}
