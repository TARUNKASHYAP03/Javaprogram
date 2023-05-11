package Program;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n=x.nextInt();
        int rem;
        int p=n;
        int rev=0;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);
        if(p==rev){
            System.out.println("This number is palindrome");
        }
        else{
            System.out.println("This number is not palindrome");
        }
        x.close();
    }
    
}
