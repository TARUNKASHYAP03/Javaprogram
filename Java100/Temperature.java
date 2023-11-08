package Java100;

import java.util.Scanner;

public class Temperature {

    public static double Celsius(int f) {
        double c = (5 * (f - 32)) / 9;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit temperature value :");
        int f = sc.nextInt();

        double cel = Celsius(f);
        System.out.println("Fahrenheit temperature in Celsius is " + cel);
        sc.close();
    }
}
