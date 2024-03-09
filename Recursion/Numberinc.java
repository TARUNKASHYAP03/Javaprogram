package JavaProgram.Recursion;

import java.util.Scanner;

public class Numberinc {
    static void printNum(int snum) {
        if (snum == 1) {
            System.out.print(snum + " ");
            return;
        }
        printNum(snum - 1);
        System.out.print(snum + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number : ");
        int snum = sc.nextInt();
        // System.out.print("Enter the ending number : ");
        // int ennum = sc.nextInt();
        printNum(snum);
        sc.close();
    }
}
