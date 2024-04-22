package JavaProgram.Codechef;

import java.util.Scanner;

public class SeedNumber {
    static boolean isSeed(int num, int x) {
        int temp = x;
        int product = 1;

        // Calculate the product of the digits of x
        while (temp != 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        // Check if the product equals num
        return (product * x == num);
    }

    static void findSeeds(int num) {
        boolean foundSeed = false;

        // Iterate through all possible numbers x from 1 to num
        for (int x = 1; x <= num; x++) {
            // Check if x is a seed of num
            if (isSeed(num, x)) {
                System.out.println(x + " is a seed of " + num);
                foundSeed = true;
            }
        }

        // If no seed is found, print "No seed exists"
        if (!foundSeed) {
            System.out.println("No seed exists for " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        // Find all seeds of the given number
        findSeeds(n);

        // Close the scanner
        sc.close();
    }
}
