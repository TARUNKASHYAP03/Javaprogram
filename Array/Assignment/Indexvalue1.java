package JavaProgram.Array.Assignment;

public class Indexvalue1 {
    public static int target(int arr[], int tg) {// Use this for O(log n) tc
        int n = arr.length;

        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == tg) {
                return mid;
            }

            // Check if the left half is sorted
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= tg && tg < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // If the left half is not sorted, then the right half must be sorted
            else {
                if (arr[mid] < tg && tg <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        int tg = 0;

        // int result = target(arr, tg);
        System.out.println("Index for key is : " + target(arr, tg));
    }
}
