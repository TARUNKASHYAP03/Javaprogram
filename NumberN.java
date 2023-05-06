package Program;

import java.util.Scanner;

public class NumberN{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number=");
        int n=x.nextInt();
        int count=0;
        while(count<=n){
            System.out.print(count+" ");
            count++;
        }
        x.close();
    }
}