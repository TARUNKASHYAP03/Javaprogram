package Java100.While;

import java.util.Scanner;

public class Sumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a last number : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum of the first " + n + " natural numbers: " + sum);

        sc.close();
    }
}
