package Program;

import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the first number =");
        int a=x.nextInt();
        System.out.println("Enter the second number =");
        int b=x.nextInt();
        if (a>b){
            System.out.println("First number is greater then second");
        }
        else{
            System.out.println("Second number is greater then first");
        }
        x.close();
    }
    
}
