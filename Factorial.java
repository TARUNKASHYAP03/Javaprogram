package Program;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n=x.nextInt();
        int i=n-1;
        while(i>0){
            n*=i;
            i--;
        }
        System.out.println("Factorial is "+n);
       x.close();
    }
    
}
