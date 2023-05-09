package Program;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=x.nextInt();
        int rev=0;
        int dub=n;
        int rem=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println(rev);
        if(dub==rev){
            System.out.println("this is pall. number");
        }
        else{
            System.out.println("this is not pall.");
        }
        x.close();
    }
    
}
