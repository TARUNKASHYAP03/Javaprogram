package Program;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number=");
        int a=x.nextInt();
        int b=x.nextInt();
        System.out.println("Enter the operator sign=");
        char operator=x.next().charAt(0);

        switch(operator){
            case '+' : System.out.println("The sum of two number is "+(a+b));
                break;
            case '-' : System.out.println("The subtraction of two number is "+(a-b)); 
                break;
            case '*' : System.out.println("The multiple of two number is "+(a*b));
                break;
            case '/' : System.out.println("The division of two number is "+(a/b));
                break;
            case '%' : System.out.println("The reminder of two number is "+(a%b));
                break;
            default : System.out.println("My Calculator is not advanced");
        }
        x.close();
    }
    
}
