package JavaProgram.Array.TwoDArray;

import java.util.Scanner;

public class Searchcell {
    static void search(int matrix[][], int key) {
        int n = matrix.length, m = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("key is exist at (" + i + "," + j + ")" + "cell");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        int n = matrix.length, m = matrix.length;
        System.out.println("Enter the number : ");
        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        search(matrix, key);
        sc.close();
    }
}
