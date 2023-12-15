package JavaProgram.Array;

import java.util.Scanner;

public class Find {
    public static int search(int numbers[], int size, int n) {
        for (int i = 0; i < size; i++) {
            if (numbers[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the array elements : ");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // Display array elements in formatted way
        System.out.print("Array elements: {");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Enter the number to search : ");
        int n = sc.nextInt();

        int index = search(arr, size, n);

        if (index == -1) {
            System.out.print("Key not exist in array");
        } else {
            System.out.println("Key is at index " + index);
        }

        sc.close();
    }
}
