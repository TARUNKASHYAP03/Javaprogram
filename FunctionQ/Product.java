package Function;

// import java.util.Scanner;

public class Product {
    public static int Prod(int a, int b) {
        int Product = a * b;
        return Product;
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first number: ");
        int a = 5;
        // System.out.print("Enter the second number: ");
        int b = 3;
        int mul = Prod(a, b);
        System.out.println("a*b =" + mul);
        mul=Prod(10,20);
        System.out.print("a*b =" + mul);
        // sc.close();
    }
}
