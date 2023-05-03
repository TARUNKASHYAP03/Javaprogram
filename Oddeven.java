package Program;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number =");
        int n=x.nextInt();
        if (n%2==0){
            System.out.println("This number is ");
        }
        else{
            System.out.println("This number is odd");
        }
        x.close();
    }
    
}
