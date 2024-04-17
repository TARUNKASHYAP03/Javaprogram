package JavaProgram.Codechef;

import java.util.Scanner;

class Onefulpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a + b + a * b) == 111) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();
    }
}
