package JavaProgram.Recursion;

public class Issorted {
    static boolean printSortedOrNot(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return printSortedOrNot(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 2, 3, 4, 5, 6 };
        System.out.println("Given array Sorted : " + printSortedOrNot(arr, 0));
    }
}
