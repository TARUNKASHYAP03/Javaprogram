package JavaProgram.Recursion;

import java.util.Scanner;

public class Numberdec {
    static void printNum(int snum, int ennum) {
        if (snum == ennum) {
            System.out.print(snum + " ");
            return;
        }
        System.out.print(snum + " ");
        printNum(snum - 1, ennum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number : ");
        int snum = sc.nextInt();
        System.out.print("Enter the ending number : ");
        int ennum = sc.nextInt();
        printNum(snum, ennum);
        sc.close();
    }
}
