package RD.Function;

import java.util.Scanner;

public class SimpleInte {

    static void myMethod() {
        double SI=

        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee salary : ");
        double income=sc.nextDouble();
        myMethod();
    }
}
