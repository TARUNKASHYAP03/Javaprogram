package JavaProgram.Function;

import java.util.Scanner;

public class isEvenOdd {
    public static Boolean Argument(int n) {
        int num = n % 2;
        if (num == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        boolean result = Argument(n);
        System.out.println("Argument is " + result);
        sc.close();
    }
}
