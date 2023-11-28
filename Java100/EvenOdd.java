package Java100;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is a Even");
        } else {
            System.out.println(n + " is a odd");
        }
        sc.close();
    }
}
