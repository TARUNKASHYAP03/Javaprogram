package Java100.While;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int j = n;

        int count = 0;
        double sum = 0;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            count++;
            sum += Math.pow(digit, count);
        }

        if (sum == n) {
            System.out.println(j + " is an Armstrong number.");
        } else {
            System.out.println(j + " is not an Armstrong number.");
        }

        sc.close();
    }
}
