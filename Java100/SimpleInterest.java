package Java100;

import java.util.Scanner;

public class SimpleInterest {

    public static double Amount(int a, int r, int y) {
        double totalpay = (a * r * y) / 100;
        return totalpay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount :");
        int a = sc.nextInt();
        System.out.print("Enter the interest rate :");
        int r = sc.nextInt();
        System.out.print("Enter the time period in year :");
        int y = sc.nextInt();

        double pay = Amount(a, r, y);
        System.out.println("Pay of interest " + pay);
        sc.close();
    }
}
