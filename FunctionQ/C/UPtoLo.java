package RD.Function;

import java.util.Scanner;

public class UPtoLo {

    public static void toLower(String str) {
        String lower = str.toLowerCase();
        System.out.print("LowerCase :" + lower);
        // return lower;
    }

    public static void toUpper(String str) {
        String Upper = str.toUpperCase();
        // return Up
        System.out.print("LowerCase :" + Upper);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the English Character :");
        String str = sc.nextLine();

        toLower(str);
        toUpper(str);
        sc.close();
    }
}
