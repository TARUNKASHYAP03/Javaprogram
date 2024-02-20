package JavaProgram.String;

import java.util.Scanner;

public class Compressusesb {
    public static String toCompress(String str) {
        StringBuilder newstr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if (count > 1) {
                newstr.append(count);
            }
        }
        return newstr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string without space : ");
        String str = sc.nextLine();
        System.out.println(toCompress(str));
        sc.close();
    }
}
