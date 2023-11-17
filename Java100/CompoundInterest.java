package Java100;

import java.util.Scanner;

public class CompoundInterest {

    public static double calculCI(double principal, double annualRate, int compoundFrequency,
            int years) {
        double compoundInterest;
        double ratePerPeriod = annualRate / compoundFrequency;
        int totalCompounds = compoundFrequency * years;

        compoundInterest = principal * Math.pow(1 + ratePerPeriod / compoundFrequency, totalCompounds) - principal;

        return compoundInterest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundFrequency = sc.nextInt();

        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

        sc.close();

        double compoundInterest = calculCI(principal, annualRate, compoundFrequency, years);

        System.out.println("Compound Interest: " + compoundInterest);
    }

}
