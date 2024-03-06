package JavaProgram.Class;

import java.util.Scanner;

public class Number {

    static void printNum(int n) {
        if (n == 0)
            return;
        printNum(n - 1);

        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        printNum(n);
    }

}