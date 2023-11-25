package Java100;

import java.util.*;

public class EqualOrNor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int f = sc.nextInt();
        System.out.print("Enter the second number:");
        int s = sc.nextInt();

        if (f == s) {
            System.out.println("First number is a eaual to second number");
        } else {
            System.out.println("First number is not a eaual to second number");
        }
        sc.close();
    }
}
