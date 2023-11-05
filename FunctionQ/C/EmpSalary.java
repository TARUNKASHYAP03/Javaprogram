package RD.Function;

import java.util.Scanner;

public class EmpSalary {

    public static double calculateHRA(double basicSalary) {
        return 0.3 * basicSalary;
    }

    public static double calculateDA(double basicSalary) {
        return 0.2 * basicSalary;
    }

    public static double calculateTA(double basicSalary) {
        return 0.1 * basicSalary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA(basicSalary);
        double pf = 1400; // Fixed PF amount

        double netSalary = basicSalary + hra + da + ta - pf;

        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("TA: " + ta);
        System.out.println("PF: " + pf);
        System.out.println("Net Salary: " + netSalary);

        sc.close();
    }

}
