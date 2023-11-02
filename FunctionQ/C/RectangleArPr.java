package RD.Function;

import java.util.Scanner;

public class RectangleArPr {

    public static int calculatearea(int l, int w) {
        int a = l * w;
        return a;
    }

    public static int calculatePerimeter(int l, int w) {
        int p = 2 * (l + w);
        return p;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length :");
        int L = sc.nextInt();
        System.out.print("Enter the width :");
        int w = sc.nextInt();

        int area = calculatearea(L, w);
        int parameter = calculatePerimeter(L, w);
        System.out.println("Area of rectangle :" + area + " square");
        System.out.println("Parameter of rectangle :" + parameter);
        sc.close();
    }
}
