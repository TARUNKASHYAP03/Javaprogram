package Java100;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);

        char smallch = Character.toLowerCase(ch);

        switch (smallch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;

            default:
                System.out.println("It is not a vowel");
                break;
        }

        sc.close();
    }
}
