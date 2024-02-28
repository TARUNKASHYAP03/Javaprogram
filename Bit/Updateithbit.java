package JavaProgram.Bit;

import java.util.Scanner;

public class Updateithbit {
    public static int toClearithBit(int n, int i) {
        int bitMask = ~(1 << i);

        return n & bitMask;
    }

    public static int toUpdateIthBit(int n, int i, int u) {
        n = toClearithBit(n, i);

        int Bitmask = u << i;
        return n | Bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of i : ");
        int i = sc.nextInt();
        System.out.print("Enter the update bit : ");
        int u = sc.nextInt();
        System.out.println(toUpdateIthBit(n, i, u));

        sc.close();
    }
}
