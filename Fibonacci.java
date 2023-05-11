package Program;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the digit of fibonacci series = ");
        int n=x.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for (int i=2;i<n;i++){
            n3=n1+n2;
            //System.out.println("First digit is "+n1);
            //System.out.println("Second digit is"+n1);
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        x.close();
    }
    
}
