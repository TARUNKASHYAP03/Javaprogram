package JavaProgram.Array;

public class Prefixsum {
    public static void maxsumarray(int arr[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;// use i
            for (int j = i; j < arr.length; j++) {
                int end = j;// use j
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.println(currsum);
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("Max Sum of subarray : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };

        maxsumarray(arr);
    }
}
