package JavaProgram.Array;

import java.util.Scanner;

public class LarSma {

    public static void graSma(int arr[], int size) {
        int largest = Integer.MIN_VALUE; //(-infinity)
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }

            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        // display result

        System.out.println("Largest value in array is " + largest + " and Smallest value in array is " + smallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the elements of array : ");

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // display array

        System.out.print("Array elements: {");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // functon call
        graSma(arr, size);

        sc.close();
    }
}
