package Java100.For;

import java.util.*;

public class Multiplication {
    public static void table(int n) {
        System.out.println("Multiplication table of " + n + " is : ");
        for (int i = 1; i <= 10; i++) {
            int mul = n * i;
            System.out.println(n + " * " + i + " = " + mul);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        table(n);

        sc.close();
    }
}
