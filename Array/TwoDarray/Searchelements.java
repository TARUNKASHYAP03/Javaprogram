package JavaProgram.Array.TwoDArray;

public class Searchelements {
    public static int staircase(int matrix[][], int key) {
        int row = 0, col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("Key is exist at (" + row + "," + col + ")");
                return 1;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 33;

        staircase(matrix, key);
    }
}
