package JavaProgram.Class;

import java.util.Scanner;

public class Power {
    static int calcPower(int num, int pow) {
        if (pow == 1)
            return num;
        return num * calcPower(num, pow - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int num = sc.nextInt();
        int pow = sc.nextInt();

        System.out.println(num + " power is " + pow + " then result : " + calcPower(num, pow));
        sc.close();
    }
}
