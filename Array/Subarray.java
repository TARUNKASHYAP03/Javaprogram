package JavaProgram.Array;

public class Subarray {
    public static void array(int arr[]) {
        int ts = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;// use i
            for (int j = i; j < arr.length; j++) {
                int end = j;// use j
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.print("Sum is " + sum);
            System.out.println();
        }
        System.out.println("Tatal subarray : " + ts);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        array(arr);
    }
}
