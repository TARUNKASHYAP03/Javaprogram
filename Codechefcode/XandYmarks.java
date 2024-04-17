package JavaProgram.Codechef;

import java.util.Scanner;

public class XandYmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x >= y * 2) {
            System.out.println("Yes X is happy");
        } else {
            System.out.println("No X is happy");
        }
        sc.close();
    }
}
