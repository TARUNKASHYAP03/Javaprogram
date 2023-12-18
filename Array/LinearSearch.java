package JavaProgram.Array;

import java.util.Scanner;

public class LinearSearch {
    public static void search(int marks[], int n) {
        boolean found = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == n) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(n + " is exist in array");
        } else {
            System.out.println(n + " is not exist in array");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Enter the element value which search : ");
        int n = sc.nextInt();

        search(marks, n);

        sc.close();
    }
}
