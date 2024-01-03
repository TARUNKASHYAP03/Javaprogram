package Java100.Loops;

import java.util.Scanner;

public class BintoDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryInput = sc.nextLine();

        int decimalResult = binaryToDecimal(binaryInput);
        
        System.out.println("Decimal equivalent: " + decimalResult);

        sc.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            char binaryDigit = binary.charAt(i);
            int digitValue = Character.getNumericValue(binaryDigit);

            int power = binaryLength - i - 1;
            decimal += digitValue * Math.pow(2, power);
        }

        return decimal;
    }
}
