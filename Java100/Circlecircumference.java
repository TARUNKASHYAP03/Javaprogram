package Java100;

import java.util.Scanner;

public class Circlecircumference {
    public static double Circum(int r) {
        double cir = 2 * 3.14 * r;
        return cir;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle :");
        int r = sc.nextInt();

        double cur = Circum(r);
        System.out.print("Circumference of " + cur);
        sc.close();
    }
}