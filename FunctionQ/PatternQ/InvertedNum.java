package RD.PatternQ;

import java.util.Scanner;

public class InvertedNum {

    public static void InveNum(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                // i++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size value :");
        int n = sc.nextInt();
        InveNum(n);
        sc.close();
    }
}
