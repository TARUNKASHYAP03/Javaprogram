package JavaProgram.Codechef;

import java.util.*;

class Goodturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((x + y) > 6) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();

    }
}
