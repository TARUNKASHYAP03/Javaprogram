package Pattern;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size value : ");
        int n = sc.nextInt();
        int leftspace = n - 1;
        int rightspace = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= leftspace; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            leftspace--;
            for (int k = 1; k <= rightspace; k++) {
                System.out.print(" ");
            }
            rightspace--;
            System.out.println();
        }
        sc.close();
    }
}
