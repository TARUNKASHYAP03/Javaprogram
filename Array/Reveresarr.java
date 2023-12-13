package JavaProgram.Array;

import java.util.Scanner;

public class Reveresarr {
    public static void swap(int arr[]) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of index " + i + " is : ");
            arr[i] = sc.nextInt();
        }

        // display array
        System.out.print("Array : {");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        swap(arr);
        System.out.print("Reverse Array : {");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        sc.close();
    }
}
