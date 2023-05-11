package Program;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        do{
            System.out.println("Enter the Number=");
            int n=x.nextInt();
            if (n%10==0){
                break;
            }
            System.out.println("This number is not a ten nultiple "+n);
        }while(true);
        x.close();
    }
    
}
