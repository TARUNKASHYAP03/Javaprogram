package JavaProgram.Divide;

public class Mergesort {
    // Function to perform merge sort
    static void mergeSort(int arr[], int si, int ei) {
        // Base case: If the start index is greater than or equal to end index,
        // return as it indicates an empty or single element array
        if (si >= ei) {
            return;
        }

        // Calculate the middle index
        int mid = si + (ei - si) / 2;

        // Recursively sort the first half of the array
        mergeSort(arr, si, mid);

        // Recursively sort the second half of the array
        mergeSort(arr, mid + 1, ei);

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    // Function to merge two sorted subarrays
    static void merge(int arr[], int si, int mid, int ei) {
        // Create a temporary array to store the merged elements
        int temp[] = new int[ei - si + 1];

        // Initialize indices for the two halves of the array and the temporary array
        int i = si; // Index for the first sorted subarray
        int j = mid + 1; // Index for the second sorted subarray
        int k = 0; // Index for the temporary array

        // Merge the two subarrays into the temporary array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of the first subarray, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements of the second subarray, if any
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements from the temporary array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        // Test case
        int arr[] = { 6, 4, 9, 5, 2, 8 };

        // Call the mergeSort function to sort the array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
