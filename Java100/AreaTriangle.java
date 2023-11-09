package Java100;

import java.util.Scanner;

public class AreaTriangle {
    public static double CalulateArea(int b, int h) {
        double area = (b * h) / 2;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of triangle :");
        int b = sc.nextInt();
        System.out.print("Enter the height of triangle :");
        int h = sc.nextInt();

        double area = CalulateArea(b, h);
        System.out.println("Area of triangle " + area);
        sc.close();
    }
}
