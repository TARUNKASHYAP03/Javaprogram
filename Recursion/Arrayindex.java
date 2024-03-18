package JavaProgram.Recursion;

public class Arrayindex {
    static void printArrayIndex(int arr[], int idx, int key) {
        if (arr.length == idx) {
            return;
        }

        if (arr[idx] == key) {
            // System.out.println("key is exist on index : "+i);
            System.out.print(idx + " ");
        }

        printArrayIndex(arr, idx + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        printArrayIndex(arr, 0, key);
    }
}