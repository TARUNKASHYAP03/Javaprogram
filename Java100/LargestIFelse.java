package Java100;

import java.util.Scanner;

public class LargestIFelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int largestNumber = findLargestNumber(num1, num2, num3);

        System.out.println("The largest number is: " + largestNumber);
        sc.close();
    }

    private static int findLargestNumber(int a, int b, int c) {
        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        return largest;
    }
}
