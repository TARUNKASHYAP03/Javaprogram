package JavaProgram.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean toCheckString(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        boolean result = false; // Declare result variable outside if block

        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray(); // Correct declaration
            char[] str2charArray = str2.toCharArray(); // Correct declaration

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else { // Case lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string : ");
        String str2 = sc.nextLine();
        toCheckString(str1, str2);
        sc.close();
    }
}
