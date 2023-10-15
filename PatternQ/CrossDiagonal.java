package Pattern;

import java.util.Scanner;

public class CrossDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size value : ");
        int n = sc.nextInt();
        int maxDigits = (int) Math.log10(n) + 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == (n - 1)) {
                    System.out.print("*");
                } else {
                    for (int k = 0; k < maxDigits; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
