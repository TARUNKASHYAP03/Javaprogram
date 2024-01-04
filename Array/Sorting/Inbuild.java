package JavaProgram.Array.Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Inbuild {
    public static void printArr(Integer arr[]) {
        for (Integer i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 2, 3 };

        Arrays.sort(arr);
        printArr(arr);

        Arrays.sort(arr, Collections.reverseOrder());

        printArr(arr);
    }
}
