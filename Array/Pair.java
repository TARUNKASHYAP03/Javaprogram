package JavaProgram.Array;

public class Pair {
    public static void pairarr(int arr[]) {
        int tp = 0;
        System.out.println("Pair of array is : ");
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pair : " + tp);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 8, 10 };

        pairarr(arr);
    }
}
