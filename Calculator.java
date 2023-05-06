package Program;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number=");
        int a=x.nextInt();
        int b=x.nextInt();
        System.out.println("Enter the operator sign=");
        char operator=x.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b); 
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default : System.out.println("My Calculator is not advanced");
        }
        x.close();
    }
    
}
