package JavaProgram.Bit;

import java.util.Scanner;

public class Getithbit {
    public static int toGetithBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of i : ");
        int i = sc.nextInt();
        System.out.println(toGetithBit(n, i));
        sc.close();
    }
}