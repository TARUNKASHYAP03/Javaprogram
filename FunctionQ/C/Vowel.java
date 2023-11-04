package RD.Function;

import java.util.Scanner;

public class Vowel {
    public static boolean isVowel(char ch) {
        char lowercaseChar = Character.toLowerCase(ch);

        return lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o'
                || lowercaseChar == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (isVowel(inputChar)) {
            System.out.println(inputChar + " is a vowel.");
        } else {
            System.out.println(inputChar + " is not a vowel.");
        }

        scanner.close();
    }

}
