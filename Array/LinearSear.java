package JavaProgram.Array;

import java.util.Scanner;

public class LinearSear {
    public static int search(int numbers[], int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 1, 2, 3, 5, 7, 9, 12, 14, 17, 19 };
        System.out.print("Enter the key value : ");
        int n = sc.nextInt();

        int index = search(numbers, n);

        if (index == -1) {
            System.out.print("Key not exist in array");
        } else {
            System.out.println("key is at index " + index);
        }

        sc.close();
    }
}
