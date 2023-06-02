import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the first number=");
        int a=x.nextInt();
        System.out.print("Enter the second number=");
        int b=x.nextInt();
        System.out.println("The product of two number is "+(a*b));
        x.close();
    }
    
}
