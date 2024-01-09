package JavaProgram.Array.Self;

public class Secondlar {
    public static void main(String[] args) {
        int arr[] = { 8, 15, 2, 37, 19, 46, 27, 81, 53 };
        int se = find(arr);

        System.out.println("Second largest element : " + se);
    }

    public static int find(int arr[]) {
        int maxValue = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                secondLargest = maxValue;
                maxValue = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < maxValue) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
