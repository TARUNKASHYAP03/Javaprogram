package RD.Function;

import java.util.Scanner;

public class DecToBin {

    public static void BintoDec(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary Number of " + myNum + " = " + binNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number : ");
        int decNum = sc.nextInt();
        BintoDec(decNum);
        sc.close();
    }
}
