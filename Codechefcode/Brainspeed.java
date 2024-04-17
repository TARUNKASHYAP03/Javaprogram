package JavaProgram.Codechef;

import java.util.Scanner;

class Brainspeed
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y > x) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();

    }
}