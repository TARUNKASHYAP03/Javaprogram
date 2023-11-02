package RD.Function;

import java.util.Scanner;

public class LeapYear {
    public static void Check(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
            System.out.println("This " + n + " is a leap year");
        } else {

            System.out.println("This " + n + " is not a leap year");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :");
        int n = sc.nextInt();
        Check(n);
        sc.close();
    }
}
