package JavaProgram.Recursion;

import java.util.Scanner;

public class Powerxn {
    static int calPowOfXn(int n, int pow) {
        if (pow == 0) {
            return 1;
        }

        int xnm1 = calPowOfXn(n, pow - 1);
        int xn = n * xnm1;

        return xn;
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
