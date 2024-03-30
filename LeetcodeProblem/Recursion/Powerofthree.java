package JavaProgram.Recursion;

import java.util.Scanner;

public class Powerofthree {
    static boolean result(int n) {
        if (n == 0) { // when number zero
            return false;
        } else if (n == 1) {// this is for case 3^0
            return true;
        } else if (n % 3 == 0) {
            return result(n / 3);// this is for case divisible number of three neglact
        } else {// this is not power of three
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for check power is three or not : ");
        int n = sc.nextInt();
        System.out.println(result(n) + " it is power of three");
        sc.close();
    }
}