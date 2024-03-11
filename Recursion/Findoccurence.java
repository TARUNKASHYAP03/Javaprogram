package JavaProgram.Recursion;

import java.util.*;

public class Findoccurence {
    static int findIndex(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return i;
        }

        if (arr[i] == key) {
            return i;
        }

        return findIndex(arr, i + 1, key);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 4, 8, 5, 7, 9, 3, 5, 6, 3, 2 };
        System.out.print("Enter the key value : ");
        int key = sc.nextInt();
        System.out.println("Key is exist index : " + findIndex(arr, 0, key));
        sc.close();
    }
}
