package Java100.For;

import java.util.Scanner;

public class Showdigit {
    public static void data(String numberStr) {
        for (int i = 0; i < numberStr.length(); i++) {
            for (int j = i; j < numberStr.length(); j++) {
                System.out.print(numberStr.charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String numberStr = Integer.toString(num);

        data(numberStr);

        sc.close();
    }
}
