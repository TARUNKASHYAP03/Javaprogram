package JavaProgram.Array.Self;

public class Threelargest {
    public static void find(int arr[], int n) {
        int first, second, third;

        if (n < 3) {
            System.out.print(" Invalid Input: Please Enter a valid array ");
            return;
        }

        third = first = second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }

            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }

            else if (arr[i] > third)
                third = arr[i];
        }

        System.out.println("Three largest elements are " + first + ", " + second + ", " + third);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 23, 43, 65, 2, 67, 34, 56 };
        int n = arr.length;
        find(arr, n);
    }
}
