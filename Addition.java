package Java100;

import java.util.Scanner;

public class Addition {

    public static int AddTwo(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number :");
        int n2 = sc.nextInt();

        int TwoSum = AddTwo(n1, n2);
        System.out.println("Addition of two number is " + TwoSum);
        sc.close();
    }
}
