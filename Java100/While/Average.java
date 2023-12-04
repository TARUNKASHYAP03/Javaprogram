package Java100.While;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Please enter a valid number greater than 0.");
            System.out.print("Enter the number of elements : ");
            n = sc.nextInt();
        }

        int sum = 0;
        int count = 0;

        while (count < n) {
            System.out.print("Enter number " + (count + 1) + " : ");
            int num = sc.nextInt();
            sum += num;
            count++;
        }

        double average = (double) sum / n;
        System.out.println("Average : " + average);

        sc.close();
    }
}
