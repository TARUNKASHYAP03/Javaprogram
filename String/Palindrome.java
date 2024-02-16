package JavaProgram.String;

import java.util.Scanner;

public class Palindrome {
    public static boolean check(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            int n = word.length();
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any word : ");
        String word = sc.nextLine();

        if (check(word)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

        sc.close();
    }
}
