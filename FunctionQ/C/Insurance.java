package RD.Function;

import java.util.Scanner;

public class Insurance {

    public static double calculatePremium(int age, String gender, String city) {
        if (age >= 25 && age <= 35 && gender.equalsIgnoreCase("male") && city.equalsIgnoreCase("Metro")) {
            return 6.0;
        } else if (age >= 25 && age <= 40 && gender.equalsIgnoreCase("male") && city.equalsIgnoreCase("Non-Metro")) {
            return 4.0;
        } else if (age >= 25 && age <= 42 && gender.equalsIgnoreCase("female") && city.equalsIgnoreCase("Metro")) {
            return 3.0;
        } else if (age >= 25 && age <= 45 && gender.equalsIgnoreCase("female") && city.equalsIgnoreCase("Non-Metro")) {
            return 2.0;
        } else {
            return -1.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Person Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Person Gender (male or female): ");
        String gender = sc.nextLine();

        System.out.print("Enter Person Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Person City (Metro or Non-Metro): ");
        String city = sc.nextLine();

        double premium = calculatePremium(age, gender, city);

        if (premium >= 0) {
            System.out.println(name + "'s insurance premium is: " + premium + "%");
        } else {
            System.out.println(name + " is not insured.");
        }

        sc.close();
    }

}
