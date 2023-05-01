import java.util.Scanner;

public class ProductAB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers =");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=a*b;
        System.out.println("The product of two number is "+product);
        sc.close();
    }
    
}
