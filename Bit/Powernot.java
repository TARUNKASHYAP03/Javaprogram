package JavaProgram.Bit;

import java.util.Scanner;

public class Powernot {
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any value : ");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n) + " : is power of 2");
        sc.close();
    }
}
