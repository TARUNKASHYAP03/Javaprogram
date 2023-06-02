import java.util.Scanner;

public class Arrayprint {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int n=x.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the value of element = ");
        for(int i=0;i<n;i++){
            System.out.print("Element "+(i+1)+ "= ");
            a[i]=x.nextInt();
            //a[i]=i+1;
        }
        System.out.println("The array is = ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
        x.close();
    }
    
}
