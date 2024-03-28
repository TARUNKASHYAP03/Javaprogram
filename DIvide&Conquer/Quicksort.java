package JavaProgram.Divide;

public class Quicksort {
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void quickSort(int arr[], int si, int ei) {
        if (si < ei) {
            // Partitioning index
            int pIdx = partition(arr, si, ei);
            // Recursively sort elements before partition and after partition
            quickSort(arr, si, pIdx - 1); // Left partition
            quickSort(arr, pIdx + 1, ei); // Right partition
        }
    }

    static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // Index of smaller element

        for (int j = si; j < ei; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[ei] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
