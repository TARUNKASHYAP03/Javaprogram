package RD;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int a = x.nextInt();
        int b = x.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(b);
        System.err.println(a);
        x.close();
    }
}
