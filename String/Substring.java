package JavaProgram.String;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        int n = string.length();
        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(string.charAt(j));
                }
            }
            System.out.print("}" + " ");
        }

        sc.close();
    }
}
