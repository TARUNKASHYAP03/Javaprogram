package JavaProgram.Array;

import java.util.Scanner;

public class Binarysearch {

    public static int binarySear(int arr[], int size, int key) {
        int start = 0, end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparee mid & key
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {// left part
                start = mid - 1;
            } else {// right part
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of array : ");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: {");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Enter the elemet value when search : ");
        int key = sc.nextInt();

        System.out.println("Index for key is : " + binarySear(arr, size, key));

        sc.close();
    }
}
