package Java100;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
      
        int smallest = (num1 < num2) ? num1 : num2;
      
        System.out.println("The smallest number is: " + smallest);
      
        scanner.close();
    }
}


