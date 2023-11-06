package RD.Function;

public class RangeEO {
    public static void printEvenNumbers() {
        System.out.println("Even numbers between 1 and 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a new line after the even numbers
    }

    public static void printOddNumbers() {
        System.out.println("Odd numbers between 1 and 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a new line after the odd numbers
    }

    public static void main(String[] args) {
        printEvenNumbers();
        printOddNumbers();
    }
}
