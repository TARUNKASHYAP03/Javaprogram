package JavaProgram.Bit;

import java.util.*;

public class Evenodd {
    public static void toCheckEven(int n) {
        int bitmask = 1;

        if ((n & bitmask) == 0) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        toCheckEven(n);
        sc.close();
    }
}
