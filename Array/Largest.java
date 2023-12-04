package JavaProgram.Array;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 12, 10, 15, 23, 7, 98, 13, 45, 78, 92, 84 };

        int l = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }
        }
        System.out.println("Largest value in array is : " + l);

        sc.close();

    }
}
