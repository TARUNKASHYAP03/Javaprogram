package JavaProgram.Recursion;

import java.util.Scanner;

public class Samecharsubstring {

    static int printSubString(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }

        if (n <= 0) {
            return 0;
        }
        int res = printSubString(str, i + 1, j, n - 1) + printSubString(str, i, j - 1, n - 1) -
                printSubString(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        int n = str.length();
        System.out.println(printSubString(str, 0, n - 1, n));
        sc.close();
    }
}
