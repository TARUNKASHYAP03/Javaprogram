package Program;

import java.util.Scanner;

public class IncomeTex {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the your salary=");
        int sal=x.nextInt();
        int tax;
        if (sal<500000){
            System.out.println("NO TAX");
        }
        else if (sal>=500000 && sal<=1000000){
            tax=(int) ((sal-500000)*(0.2));
            System.out.println(tax);
        }
        else{
            tax=(int)((sal-500000)*0.2+(sal-1000000)*0.3);
            System.out.println(tax);
        }
        x.close();

    }
    
}
