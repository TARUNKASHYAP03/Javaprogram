package Java100.While;

import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int N = n;

        int reversedNum = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n = n / 10;
        }

        System.out.println(N + " Reversed Number is : " + reversedNum);

        sc.close();
    }
}
