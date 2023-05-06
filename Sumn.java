package Program;

import java.util.Scanner;

public class Sumn {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=x.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            System.out.println(sum);
            i++;
        }
        x.close();
    }
    
}
