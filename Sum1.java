import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers =");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of two number is "+sum);
        sc.close();
    }
    
}
