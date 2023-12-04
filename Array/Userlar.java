package JavaProgram.Array;

import java.util.Scanner;

public class Userlar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

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