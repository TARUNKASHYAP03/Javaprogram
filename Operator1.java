package Program;

import java.util.Scanner;

public class Operator1 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the numbers=");
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        if (a>b && b>c){
            System.out.println("Hello World");
        }
        if (c>b && c<a){
            System.out.println("Welcome in Java World");
        }
        if ((b+200)<a && (b+150)<c){
            System.out.println("Welcome Tarun Kashyap");
        }
        x.close();
    }
    
}
