package Pattern;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column size : ");
        int column = sc.nextInt();
        System.out.print("Enter the row size : ");
        int row = sc.nextInt();
        for (int i = 1; i <= column; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || j == 1 || i == column || j == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
