package Java100;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int largest;
        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }

        System.out.println("The largest number between " + num1 + " and " + num2 + " is: " + largest);

        sc.close();
    }
}
