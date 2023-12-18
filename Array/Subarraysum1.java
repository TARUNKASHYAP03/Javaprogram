package JavaProgram.Array;

public class Subarraysum1 {
    public static void kadane(int arr[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];

            if (currsum < 0) {
                currsum = 0;
            }

            maxSum = Math.max(currsum, maxSum);
            System.out.println("curr sum : " + currsum);
        }

        System.out.println("Maxmimum sum in subarray is : " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -1 };

        kadane(arr);
    }
}
