package Java100.While;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int j = number;

        int digitCount = 0;

        while (number > 0) {
            number = number / 10;
            digitCount++;
        }

        System.out.println(j + " Number of digits : " + digitCount);

        sc.close();
    }
}
