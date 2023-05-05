package Program;

import java.util.Scanner;

public class Larger1 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the numbers=");
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        if (a>=b && a>=c){
            System.out.println("A is greater then B and C");
        }
        else if(b>=c){
            System.out.println("B is greater than A and C");
        }
        else{
            System.out.println("C is greater than A and B");
        }
        x.close();
    }
    
}
