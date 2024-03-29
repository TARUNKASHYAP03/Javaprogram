package JavaProgram.String;

import java.util.*;

public class Compress {
    public static String toCompress(String str) {
        String newstr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string without space : ");
        String str = sc.nextLine();
        System.out.println(toCompress(str));
        sc.close();
    }
}
