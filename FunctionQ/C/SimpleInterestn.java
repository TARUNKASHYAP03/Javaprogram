package RD.Function;

import java.util.Scanner;

public class SimpleInterestn {
    public static double print(double amount, float years, int rate) {
        double ip = (amount * rate * years) / 100;
        // double tip = amount - ip;
        // System.out.print("Pay of Simple Interest :" + ip);
        return ip;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount :");
        double amount = sc.nextDouble();
        System.out.print("Enter the interest  rate :");
        int rate = sc.nextInt();
        System.out.print("Enter the time period of years :");
        float years = sc.nextFloat();

        double simpleInterest = print(amount, years, rate);
        System.out.println("Simple Interest: " + simpleInterest);
        sc.close();
    }
}
