package JavaProgram.Array;

public class Subarraysum {
    public static void maxsumarray(int arr[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;// use i
            for (int j = i; j < arr.length; j++) {
                int end = j;// use j
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("Max Sum of subarray : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        maxsumarray(arr);
    }
}
