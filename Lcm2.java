import java.util.Scanner;

public class Lcm2 {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the first number is ");
        int a=x.nextInt();
        System.out.print("Enter the second number is ");
        int b=x.nextInt();
        int lcm;
        lcm=(a>b)?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.printf("The lcm of %d and %d is %d.",a,b,lcm);
                break;
            }
            ++lcm;
        }

        x.close();
        
    }
}
