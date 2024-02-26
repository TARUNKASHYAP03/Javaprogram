package JavaProgram.Bit;

import java.util.Scanner;

public class Setithbit {
    public static int toSetithBit(int n, int i) {
        int bitMask = 1 << i;

        return n | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of i : ");
        int i = sc.nextInt();
        System.out.println(toSetithBit(n, i));
        sc.close();
    }
}
