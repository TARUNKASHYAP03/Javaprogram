package Java100.While;

import java.util.Scanner;

public class Palindrome {
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
        if (reversedNum == N) {
            System.out.println(N + "  is palindrome");
        } else {
            System.out.println(N + " is not palindrome");
        }

        sc.close();
    }
}
