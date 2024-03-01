package JavaProgram.Bit;

import java.util.Scanner;

public class Fastexponentiation {
    public static int toPowerCalu(int n, int p) {
        int ans = 1;

        while (p > 0) {
            if ((p & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            p = p >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the power : ");
        int n = sc.nextInt();
        System.out.print("Enter the power value : ");
        int p = sc.nextInt();
        System.out.println("Answer : " + toPowerCalu(n, p));
        sc.close();
    }
}
