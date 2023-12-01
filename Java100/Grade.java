package Java100;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student marks : ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Student grade is A");
        } else if (marks <= 89 && marks >= 80) {
            System.out.println("Student grade is B");
        } else if (marks <= 79 && marks >= 70) {
            System.out.println("Student grade is C");
        } else if (marks <= 69 && marks >= 60) {
            System.out.println("Student grade is C");
        } else {
            System.out.println("Student grade is F");
        }

        sc.close();
    }
}
