package JavaProgram.Array.Assignment;

public class Indexvalue {
    public static int target(int arr[], int tg) {

        for (int i = 0; i < arr.length; i++) {
            if (tg == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int tg = 0;

        int result = target(arr, tg);

        if (result != -1) {
            System.out.println("Target value " + tg + " found at index: " + result);
        } else {
            System.out.println("Target value " + tg + " not found in the array.");
        }
    }
}
