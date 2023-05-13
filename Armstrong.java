import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n=x.nextInt();
        int temp=n;
        int sum=0,digits=0;
        while(temp>0){
            temp/=10;
            digits++;
        }
        temp=n;
        while(temp>0){
            int digit =temp%10;
            sum+=(Math.pow(digit,digits));
            temp/=10;
        }
        if(n==sum){
            System.out.print(" is a armstrong number");
        }
        else{
            System.out.print(" is not armstrong number");
        }
        x.close();
    }
    
}
