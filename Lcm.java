import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int max,s,lcm=0;
        System.out.println("Enter the first number = ");
        int a=x.nextInt();
        System.out.println("Enetr the second number = ");
        int b=x.nextInt();
        if(a>b){
            max=s=a;
        }
        else{
            max=s=b;
        }
        //int max=Math.max(a,b);
        //int lcm=max;
        while(a!=0){
            if(max%a==0 && max%b==00){
            lcm=max;
            break;
            }
            max+=s;
    }
        
        System.out.println("The lcm of " +a+ " and " +b +" is " +lcm);
        x.close();

    }
    
}
