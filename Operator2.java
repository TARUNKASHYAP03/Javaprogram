package Program;

import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        //System.out.println("Entre the number=");
        //int a,b,c,d,e;
        System.out.println("Entre the first number=");
        int a=x.nextInt();
        System.out.println("Entre the second number=");
        int b=x.nextInt();
        System.out.println("Entre the third number=");
        int c=x.nextInt();
        System.out.println("Entre the fourth number=");
        int d=x.nextInt();
        System.out.println("Entre the fifth number=");
        int e=x.nextInt();
        int ex=4/3*(d+34)+9*(a+b*c)+(3+e*(2+a))/(a+b*e);
        System.out.println(ex);
        x.close();
    }
    
}
