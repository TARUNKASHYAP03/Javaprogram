package JavaProgram.Array;

import java.util.Scanner;

public class StringLinSea {
    public static int search(String menu[], String str) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[] = { "Dosa", "Kulcha", "Petish", "Samosa", "Cold Drink" };

        System.out.print("Enter the string name: ");

        String str = sc.nextLine();

        int index = search(menu, str);

        if (index == -1) {
            System.out.print("Key not exist in array");
        } else {
            System.out.println("key is at index " + index);
        }

        sc.close();
    }
}
