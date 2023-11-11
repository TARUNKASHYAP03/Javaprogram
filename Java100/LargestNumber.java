package Java100;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int result = (num1 > num2) ? num1 : num2;

        System.out.println("The largest number is " + result);

        sc.close();
    }
}
