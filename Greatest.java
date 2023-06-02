import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the three number =");
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        if (a>b && a>c){
            System.out.println("Greatest number is a");
        }
        else if(b>a && b>c){
            System.out.println("Greatest number is b");
        }
        else{
            System.out.println("Greatest nu,ber is c");
        }x.close();
    }
    
}
