package JavaProgram.Recursion;

import java.util.*;

public class Lastoccurence {
    static int findLastOccureIndex(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        int isfound = findLastOccureIndex(arr, i + 1, key);

        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 4, 8, 5, 7, 9, 3, 5, 6, 3, 2 };
        System.out.print("Enter the key value : ");
        int key = sc.nextInt();
        System.out.println("Key is exist index : " + findLastOccureIndex(arr, 0, key));
        sc.close();
    }
}
