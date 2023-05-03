package Program;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the numbers =");
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        int exp1=(b*(a/b+a/b));
        int exp2=(b*a/b+b*a/b);
        c /=(a+b);
        System.out.println(exp1 + " , ");
        System.out.println(exp2);
        System.out.println(c);
        x.close();
    }
    
}
