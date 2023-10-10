package Pattern;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column size : ");
        int column = sc.nextInt();
        System.out.print("Enter the row size : ");
        int row = sc.nextInt();
        for (int j = 1; j <= column; j++) {
            for (int i = 1; i <= row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
