import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the two number=");
        int a=x.nextInt();
        int b=x.nextInt();
        int s=a+b;
        int su=a-b;
        int m=a*b;
        int d=a/b;
        int mo=a%b;
        System.out.println("Two number sum is "+s);
        System.out.println("Two number subtraction is "+su);
        System.out.println("Two number multiplication is "+m);
        System.out.println("Two number division is "+d);
        System.out.println("Two number modulo is "+mo);
        x.close();
    }
    
}
