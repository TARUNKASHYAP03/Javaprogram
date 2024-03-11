package JavaProgram.Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int printFiboNth(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = printFiboNth(n - 1);
        int f2 = printFiboNth(n - 2);
        int fn = f1 + f2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculate the nth term for fibonacci : ");
        int n = sc.nextInt();
        System.out.println("Nth term value in fibonacci series is : " + printFiboNth(n));
        sc.close();
    }
}
