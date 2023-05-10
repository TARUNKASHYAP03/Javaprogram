package Program;

import java.util.Scanner;

public class Reversnumber {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number=");
        int n=x.nextInt();
        int i=1;
        while(n>0){
            n-=i;
            System.out.print(n);
            i--;
        }
        x.close();
    }
    
}
