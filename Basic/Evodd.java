package RD;

import java.util.Scanner;

public class Evodd {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = x.nextInt();
        String[] num = { "Even", "Odd" };
        System.out.println(n + " is " + num[n & 1]);
        x.close();
    }

}