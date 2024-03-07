package JavaProgram.Class;

import java.util.Scanner;

public class Sum {

    static int printSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + printSum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum is " + printSum(n));
    }
}
