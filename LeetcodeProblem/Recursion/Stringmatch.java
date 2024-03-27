package LeetcodeDailyProblem.Recursionproblem;

import java.util.Scanner;

public class Stringmatch {
    static boolean isMatch(String s, String p) {
        // Base case: If pattern is empty, return whether input string is also empty or
        // not
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        // Check if first characters of both strings match or if pattern has '.'
        boolean firstMatch = !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');

        // If pattern has '*' as the next character
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // Check if pattern after '*' matches 0 times or 1 or more times with current
            // character of input string
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            // If pattern doesn't have '*', check if first characters match and proceed to
            // next characters
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s = sc.nextLine();
        System.out.print("Enter another string : ");
        String p = sc.nextLine();
        System.out.println("Result : " + isMatch(s, p));
        sc.close();
    }
}
