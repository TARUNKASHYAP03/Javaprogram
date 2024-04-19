package JavaProgram.Codechef;

import java.util.Scanner;

public class Addtwonumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();

        // Iterate through each test case
        for (int i = 0; i < T; i++) {
            // Read the two integers for each test case
            int A = sc.nextInt();
            int B = sc.nextInt();

            // Calculate the sum of A and B
            int sum = A + B;

            // Output the sum
            System.out.println(sum);
        }

        // Close the scanner
        sc.close();
    }
}
