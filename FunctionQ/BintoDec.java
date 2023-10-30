package RD.Function;

import java.util.Scanner;

public class BintoDec {
    public static void binToDec(int binNUM) {
        int myNum = binNUM;
        int pow = 0;
        int decNum = 0;

        while (binNUM > 0) {
            int lastDigit = binNUM % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNUM = binNUM / 10;
        }
        System.out.println("Decimal number of " + myNum + " = " + decNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number :");
        int binNUM = sc.nextInt();
        binToDec(binNUM);
        sc.close();
    }
}
