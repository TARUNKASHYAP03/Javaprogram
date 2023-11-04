package RD.Function;

import java.util.Scanner;

public class Grade {
    public static char getGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        char grade = getGrade(percentage);
        System.out.println("Your grade is: " + grade);

        sc.close();
    }

}
