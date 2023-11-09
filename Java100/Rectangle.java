package Java100;

import java.util.Scanner;

public class Rectangle {
    public static int CalculateArea(int l, int w) {
        int area = l * w;
        return area;
    }

    public static int CalculateCircum(int l, int w) {
        int circum = 2 * (l * w);
        return circum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle :");
        int l = sc.nextInt();
        System.out.print("Enter the width of rectangle :");
        int w = sc.nextInt();

        int area = CalculateArea(l, w);
        int circum = CalculateCircum(l, w);
        System.out.println("Area of rectangle " + area);
        System.out.print("Circumference of rectangle " + circum);
        sc.close();
    }
}
