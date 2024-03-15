package JavaProgram.Recursion;

import java.util.Scanner;

public class Duplicates {
    static void removeDupilChar(String str, int idx, StringBuilder newstr, boolean[] map) {
        // Base Condition
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        // Work
        char currchar = str.charAt(idx);
        if (!map[currchar - 'a']) {
            // Character not encountered before
            map[currchar - 'a'] = true;
            removeDupilChar(str, idx + 1, newstr.append(currchar), map);
        } else {
            // Character encountered before (duplicate)
            removeDupilChar(str, idx + 1, newstr, map);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        boolean[] map = new boolean[26]; // Initialize array to keep track of encountered characters
        removeDupilChar(str, 0, new StringBuilder(""), map);
        sc.close();
    }
}
