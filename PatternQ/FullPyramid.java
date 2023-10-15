package Pattern;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size value : ");
        int n = sc.nextInt();
        int mid = n / 2;
        int space = mid;
        int starcount = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= starcount; k++) {
                System.out.print("*");
            }
            if (i < mid) {
                starcount += 2;
                space--;
            } else {
                starcount -= 2;
                space++;
            }
            System.out.println();
        }
        
        sc.close();
    }
}
